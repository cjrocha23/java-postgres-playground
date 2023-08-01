package com.example;

public class AppCliente {
    String nome;
    double renda;
    char sexo;
    int anoNascimento;

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
            System.out.println("A renda deve ser maior que zero.");
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
}
