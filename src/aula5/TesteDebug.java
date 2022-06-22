package aula5;

/**
 *
 * @author franciele
 */
public class TesteDebug {
    public static void main(String[] args) {
        int valor1;
        try {
            
        
        valor1 = 123;
        String valor2 = "f";
        
        if (Integer.parseInt("jonas") == valor1) {
            System.out.println("IGUAIS");
        } else {
            System.out.println("DIFERENTES");
            
        }
        
        String nome = "jonas";
        
        } catch (Exception ex) {
            System.out.println("erro: " + ex.getMessage());
        }
        
      
    }
    
}
