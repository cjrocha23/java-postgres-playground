package com.sistemaensino;

public class Aluno {
    private Integer matricula;
    private String nome;
    private Double nota1, nota2, nota3;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public double getNota1() {
        return nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getNota3() {
        return nota3;
    }
    
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calculaMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
}
