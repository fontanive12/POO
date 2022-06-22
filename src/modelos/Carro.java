package modelos;

import java.util.function.ToIntBiFunction;

/**
 *
 * @author franciele
 */
public class Carro {
    
    private String numero_chassi;
    private String cor;
    private Modelo modelo;
    private int ano_modelo;
    private int ano_fabricacao;
    
    public Carro() {
        
    }

    public Carro(String numero_chassi, String cor, String marca, Modelo modelo, int ano_modelo, int ano_fabricacao) {
        this.numero_chassi = numero_chassi;
        this.cor = cor;
        this.modelo = modelo;
        this.ano_modelo = ano_modelo;
        this.ano_fabricacao = ano_fabricacao;
    }
    
    

    public String getNumero_chassi() {
        return numero_chassi;
    }

    public void setNumero_chassi(String numero_chassi) {
        this.numero_chassi = numero_chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("-----------------\n");
        retorno.append("Marca:");
        retorno.append(modelo.getMarca());
        retorno.append("\n");
        retorno.append("Modelo:");
        retorno.append(modelo);
        retorno.append("\n");
        retorno.append("Ano:");
        retorno.append(ano_fabricacao);
        retorno.append("/");
        retorno.append(ano_modelo);
        retorno.append("\n");
        retorno.append("-----------------");
        
        return retorno.toString();
        
    }
}











//System.out.println(objCarro1);
//        System.out.println(objCarro2);arro objCarro1 = new Carro("123456", "Azul", "Chevrolet", "Opala", 1980, 1981);
////        objCarro.setMarca ("Fiat");
////        objCarro.setModelo("147");
////        objCarro.setAno_fabricacao(1980);
////        objCarro.setAno_modelo(1981);
//
//        Carro objCarro2 = new Carro("654321", "Cinza", "Fiat", "Siena", 2012, 2010);
//        
//        System.out.println(objCarro1);
//        System.out.println(objCarro2);
