/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

import modelos.Aluno;

/**
 *
 * @author franciele
 */
public class ExercicioAluno {
    public static void main(String[] args) {
       
    
        Aluno objAluno1 = new Aluno();
        objAluno1.setNome("Bruno");
        objAluno1.setIdade(36);
        objAluno1.setAltura(1.90);
        objAluno1.setSexo('M');
        
        Aluno objAluno2 = new Aluno();
        objAluno2.setNome("Yuri");
        objAluno2.setIdade(23);
        objAluno2.setAltura(1.70);
        objAluno2.setSexo('M');
        
        if(objAluno1 == objAluno2) {
            System.out.println("igual");
        } else {
            System.out.println("nao");
        }
        
        //o método imprimir dee mostrar o nome e a idade do aluno juntos
        objAluno1.imprimir();
        objAluno2.imprimir();        
        
        objAluno2.fazAniversario();
        objAluno2.imprimir();
        
        
    } 
}
