package com.example;

public class AppProduto {
    private Long id;
    private String nome;
    private double valor;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public AppMarca getMarca() {
        return marca;
    }
    
    public void setMarca(AppMarca marca) {
        this.marca = marca;
    }
    
    private AppMarca marca;
    
}
