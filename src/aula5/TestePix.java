package aula5;

import aula4.TesteContaBanco;
import modelos.ContaBanco;
import ferramentas.Entrada;
/**
 *
 * @author franciele
 */
public class TestePix {
    static ContaBanco[] contas = new ContaBanco[3];
    public static void main(String[] args) {
        
        
        
        ContaBanco objConta1 = new ContaBanco("111", "123", "Pessoa1", 1000, 300, "51999338811");
        ContaBanco objConta2 = new ContaBanco("222", "456", "Pessoa2", 400, 5000, "51999118833");
        ContaBanco objConta3 = new ContaBanco("333", "789", "Pessoa3", 5000, 300, "user@gmail.com");
//        
//        System.out.println(objConta1);
//        System.out.println(objConta2);
//        System.out.println(objConta3);
        
        contas[0] = objConta1;
        contas[1] = objConta2;
        contas[2] = objConta3;
        
        //recebendo o número da conta que pretende transferir o PIX
        String contaOrigem = Entrada.leiaString("Informe a conta de origem: ");   
        ContaBanco objContaOrigem = localizaContaOrigem(contaOrigem);
        
//        if (objContaOrigem != null) {
//            
//        }
        
        String chavePixDestino = Entrada.leiaString("Informe a conta de destino: ");
        double valorPix = Entrada.leiaDouble("Informe o valor do PIX: ");
       
        
      
       ContaBanco objContaDestino = localizaContaDestino(chavePixDestino);
       
       
       objContaOrigem.transferirPix(objContaDestino, valorPix);
       
        System.out.println(objContaOrigem.toString());
        System.out.println(objContaDestino.toString());
        
//        for (int i = 0; i < contas.length; i++) {
//            if (contas[i].getConta().equals(contaOrigem)) {
//                
//               
//            }
//            
//        }
        
//        String contaDestino = Entrada.leiaString("Informe a conta de destino: ");
     
        
        //ContaBanco objContaOrigem = localizaContaOrigem(contaOrigem);
        
//        objContaOrigem.transferirPix(objContaDestino, 600);
        
        
    }
    
    
    
    private static ContaBanco localizaContaDestino(String chavePix) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getChavePix().equals(chavePix)) {
                return contas[i];
            }
            
        }
        return null;
    }
    
    
    private static ContaBanco localizaContaOrigem(String conta){
        ContaBanco contaRetorno = null;
        
        for (int i = 0; i < 3; i++) {            
            if (contas[i].getConta().equals(conta)){
                contaRetorno = contas[i];
            }
        }
               
        return contaRetorno;
    }
        
}
