package aula4;
import ferramentas.Entrada;

/**
 *
 * @author franciele
 */
public class TesteArea {
    public static void main(String[] args) {
        
        double base = Entrada.leiaDouble("Digite o tamanho da base: ");
        double altura = Entrada.leiaDouble("Digite o tamanho da altura: ");
        
        double resultado = calcularAreaQuadrado (base, altura);
        
        System.out.printf("Valor total da área: %.2f", resultado);
        
        System.exit(0);
    }
    
    private static double calcularAreaQuadrado (double area1, double area2) {
        
        return area1 * area2;
        
        
    }
    
    
}
