package com.example;

public class AppOperadoresLogicos {

    boolean a(boolean valor) {
        System.out.println("a");
        return valor;
    }

    boolean b(boolean valor) {
        System.out.println("b");
        return valor;
    }

    boolean c(boolean valor) {
        System.out.println("c");
        return valor;
    }

    AppOperadoresLogicos() {
        System.out.println(a(true) && b(false) && c(true));
    }

    public static void main(String[] args) {
        new AppOperadoresLogicos();
        
    }
}
