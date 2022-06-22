/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author franciele
 */
public class Aluno {
    
    private String nome;
    private int idade;
    private double altura;
    private char sexo;
    
    public int variavel_public;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    public void fazAniversario() {
        idade++;
    }
    
    public void imprimir() {
        System.out.println("O aluno " + nome + " tem " + idade + " anos " + altura + " m de altura e é do sexo " + sexo);
    }
    
}
