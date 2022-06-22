package aula2;

import modelos.Carro;
import modelos.Modelo;

/**
 *
 * @author franciele
 */
public class ManipularObjetos {
    
    public static void main(String[] args) {
        
        Modelo objModelo = new Modelo("Chevrolet", "Opala");
        
        Carro objCarro1 = new Carro("123456", "Azul", "Chevrolet", 
                objModelo, 1980,1981);
        
        Carro objCarro2 = new Carro();
        objCarro2.setModelo(objModelo);
        objCarro2.setAno_fabricacao(1980);
        objCarro2.setAno_modelo(1981);
        
        
        
        
        
        
        //qual dos 2 carros é o mais novo?
        
        String objRetorno = obterCarroMaisNovo (objCarro1, objCarro2);
        System.out.println("Carro mais novo: " + objRetorno);
        
        
    }
        
    public static String obterCarroMaisNovo(Carro obj1, Carro obj2) {
        
        
        
        if (obj1.getAno_fabricacao() > obj2.getAno_fabricacao()) {
            return obj1.toString();
        } else if (obj1.getAno_fabricacao() < obj2.getAno_fabricacao()){
            return obj2.toString();
        } else {
            return "os dois carros são iguais";
        }
        
        
        
        
    }
}