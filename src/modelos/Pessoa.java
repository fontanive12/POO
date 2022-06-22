package modelos;

/**
 *
 * @author franciele
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
        
    }

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("-----------------\n");
        retorno.append("Nome: ");
        retorno.append(nome);
        retorno.append("\n");
        retorno.append("Idade: ");
        retorno.append(idade);
        retorno.append("\n");
        retorno.append("Altura: ");
        retorno.append(altura);
        retorno.append("\n");
        retorno.append("Peso: ");
        retorno.append(peso);
        retorno.append("\n");
        retorno.append("-----------------");
        
        return retorno.toString();
    
    
    
    }
        
    
}
