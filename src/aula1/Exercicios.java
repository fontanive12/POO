package aula1;

/**
 *
 * @author franciele
 */

 /*
        public = é o modificador de acesso 
        permite que o método fique visível para outras classes
        private = permite que apenas a própria classe utilize o método
        public = 
        
        static = permite que o método seja invocado sem necessidade de criar uma nova instância
    
        void = o método em questão não tem retorno
    */

public class Exercicios {
    
    public static void main(String[] args) {
        
        int var1 = 30;
        int var2 = 28;
        
        String resultado = imprimirResultados(var1, var2);
        System.out.println(resultado);
        
        
    }
    
    public static String imprimirResultados(int var1, int var2){
        
        StringBuilder resultadoFinal = new StringBuilder();
        resultadoFinal.append("var1 = ");
        resultadoFinal.append(var1);        
        resultadoFinal.append("\n");
        
        resultadoFinal.append("var2 = ");
        resultadoFinal.append(var2);        
        resultadoFinal.append("\n");

        resultadoFinal.append("var1 == var2 ");
        resultadoFinal.append(var1 == var2);        
        resultadoFinal.append("\n");

        resultadoFinal.append("var1 != var2 ");
        resultadoFinal.append(var1 != var2);        
        resultadoFinal.append("\n");
        
        return resultadoFinal.toString();
        
    }
}
    

        
        
        
        
        
        
        
        
        
        
