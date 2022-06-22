package aula3;
import modelos.Questionario;
import ferramentas.Entrada;
/**
 *
 * @author franciele
 */
public class TesteQuestionario {
    public static void main(String[] args) {
        
        Questionario[] vetorQuestoes = new Questionario[3];
        
        Questionario objQuestao1 = new Questionario();
        
        objQuestao1.setPergunta("Quanto é 6 x 4?");
        objQuestao1.setRespostaA("20");
        objQuestao1.setRespostaB("24");
        objQuestao1.setRespostaC("28");
        objQuestao1.setRespostaCorreta('2');
        
        vetorQuestoes[0] = objQuestao1;
        
        Questionario objQuestao2 = new Questionario();
        
        objQuestao2.setPergunta("Quanto é 6 x 5?");
        objQuestao2.setRespostaA("40");
        objQuestao2.setRespostaB("24");
        objQuestao2.setRespostaC("30");
        objQuestao2.setRespostaCorreta('3');
        
        vetorQuestoes[1] = objQuestao2;
        
        Questionario objQuestao3 = new Questionario();
        
        objQuestao3.setPergunta("Quanto é 6 x 6?");
        objQuestao3.setRespostaA("30");
        objQuestao3.setRespostaB("36");                
        objQuestao3.setRespostaC("42");
        objQuestao3.setRespostaCorreta('2');
        
        vetorQuestoes[2] = objQuestao3;
        
        realizarQuestionario(vetorQuestoes);
    }
        private static void realizarQuestionario(Questionario[] questoes) {
            //criar uma variável para contar os acertos 
            int acertos = 0;    
            
            //criar um laço de repetição
            for (int i = 0; i < questoes.length; i++) {               
                char resposta1 = Entrada.leiaChar(questoes[0].realizarPergunta());
                char resposta2 = Entrada.leiaChar(questoes[1].realizarPergunta());
                char resposta3 = Entrada.leiaChar(questoes[2].realizarPergunta());
                
                if (resposta1 == questoes[i].getRespostaCorreta()) {
                    acertos++;
                }
           
                if (resposta2 == questoes[i].getRespostaCorreta()) {
                    acertos++;
                }
        
                if (resposta3 == questoes[i].getRespostaCorreta()) {
                    acertos++;
                }
            }        
        
            System.out.println("Quantidade de acertos: " + acertos);
     
            System.exit(0);
    }
}
