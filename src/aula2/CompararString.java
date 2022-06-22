package aula2;

/**
 *
 * @author franciele
 */

//testar se os nomes são exatamentes iguais
//testar se a capitalização e ver se ainda são iguais
//testar se os nomes são diferentes 

public class CompararString {
    public static void main(String[] args) {
    
        String nome1 = "Juca Bala";
        String nome2 = "Juca Bala";
    
        
        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são exatamentes iguais");
        } else if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Nomes iguais, mas com capitalização diferente.");
        } else {
             System.out.println("Os nomes são diferentes");
        }
            
    }
 
}

