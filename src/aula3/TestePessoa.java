package aula3;

import modelos.Pessoa;
import ferramentas.Entrada;
/**
 *
 * @author franciele
 */
public class TestePessoa {
    public static void main(String[] args) {
        
        Pessoa objPessoa = new Pessoa();
        
            objPessoa.setNome(Entrada.leiaString ("Digite seu nome: "));
            objPessoa.setIdade(Entrada.leiaInt ("Digite sua idade: "));
            objPessoa.setAltura(Entrada.leiaDouble ("Digite sua altura: "));
            objPessoa.setPeso(Entrada.leiaDouble ("Digite seu peso: "));
    //        
//        System.out.println("Nome: " + objPessoa.getNome());

        System.out.println(objPessoa.toString());
        
         Pessoa objPessoa2 = new Pessoa();
        
            objPessoa2.setNome(Entrada.leiaString ("Digite seu nome: "));
            objPessoa2.setIdade(Entrada.leiaInt ("Digite sua idade: "));
            objPessoa2.setAltura(Entrada.leiaDouble ("Digite sua altura: "));
            objPessoa2.setPeso(Entrada.leiaDouble ("Digite seu peso: "));

        System.out.println(objPessoa2.toString());
        
        
        //testar se o nome das pessoas são iguais
        
        if (objPessoa.getNome().equals(objPessoa2.getNome())) {
            System.out.println("Os nomes são iguais.");
        } else if (objPessoa.getNome().equalsIgnoreCase(objPessoa2.getNome())) {
            System.out.println("Os nomes são iguais, mas com capitalização diferente. ");
        } else {
            System.out.println("Os nomes não são iguais.");
        }
        
        
        //maior nome
        
       if (objPessoa.getNome().length() > objPessoa2.getNome().length()) {
           System.out.println("O nome " + objPessoa.getNome() + " é o maior que o nome " + objPessoa2.getNome());
           
       } else if (objPessoa.getNome().length() < objPessoa2.getNome().length()) {
           System.out.println("O nome " + objPessoa2.getNome() + " é o maior" + objPessoa.getNome());
       } else {
           System.out.println("O nome " + objPessoa2.getNome() + " e o nome " + objPessoa.getNome() + " possuem o mesmo tamanho");
       }
        
        System.exit(0);
    }
}
