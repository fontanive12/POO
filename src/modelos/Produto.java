package modelos;
/**
 *
 * @author franciele
 */
public class Produto {
    
    private String nome;
    private int codigo;
    private String cor;    
    private double peso;
   
    
    public Produto() {
    
    }

    public Produto(String nome, int codigo, String cor, double peso) {
        this.nome = nome;
        this.codigo = codigo;
        this.cor = cor;
        this.peso = peso;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}



