package aula4;

import aula4.AreaRetangulo;
import aula4.AreaTriangulo;
import ferramentas.Entrada;

/**
 *
 * @author franciele
 */
public class TesteAreas {
    public static void main(String[] args) {
        
        AreaRetangulo objRetangulo = new AreaRetangulo();
        
        objRetangulo.setBase(Entrada.leiaDouble("Digite o tamanho da base do retângulo: "));
        objRetangulo.setAltura(Entrada.leiaDouble("Digite o tamanho da altura do retângulo: "));
        
        System.out.println("Área do retângulo: " + objRetangulo.calcularArea() + " cm");
        
                
        AreaTriangulo objTriangulo = new AreaTriangulo();
        
        objTriangulo.setBase(Entrada.leiaDouble("Digite o tamanho da base do triângulo: "));
        objTriangulo.setAltura(Entrada.leiaDouble("Digite o tamanho da altura do triângulo: "));
            
        System.out.println("Área do triângulo: " + objTriangulo.calcularArea() + " cm");
        
    }

}
