package com.example.Model;

public class Cliente {
    private String nome;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private String cpf;
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private boolean especial = true;

    public Cliente() {
        // Método usado apenas para mensagem.
        System.out.println("Criando cliente cliente.");
    }

    public Cliente(String nome, double renda, char sexo, int anoNascimento) {
        this();
        this.nome = nome;
        //this.renda = renda;
        setRenda(renda);
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getRenda() {
        return renda;
    }
    
    public void setRenda(double renda) {
        if (renda >= 0)
            this.renda = renda;
        else
            System.out.println("A renda deve ser maior ou igual a zero.");
    }

    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F' || sexo == 'T')
            this.sexo = sexo;
        else
            System.out.println("Sexo deve ser M, F ou T.");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String toString() {
        return "Nome Cliente: " + nome;
    }
}
