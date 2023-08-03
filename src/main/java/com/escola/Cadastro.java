package com.escola;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("### ESCOLA CADASTRO ###");
        System.out.println("[1] Cadastra Aluno.");
        System.out.println("[2] Cadastra Notas.");
        System.out.println("Selecione 1 ou 2: ");
        int opcaoCadastro = scanner.nextInt();
        if (opcaoCadastro == 1) {
            System.out.println("### Cadastro de Aluno ###");
            
            System.out.println("Matricula: ");
            String matricula = scanner.nextLine();
            
            System.out.println("Nome.....: ");
            String nome = scanner.nextLine();
            
            System.out.println("Materia1.: ");
            String materia1 = scanner.nextLine();
            
            System.out.println("Materia2.: ");
            String materia2 = scanner.nextLine();
            
            System.out.println("Materia3.: ");
            String materia3 = scanner.nextLine();
            
            System.out.println("-- resultado ---");
            System.out.println("Matricula:" + matricula);
            System.out.println("Nome.....:" + nome);
            System.out.println("Materia 1:" + materia1);
            System.out.println("Materia 2:" + materia2);
            System.out.println("Materia 3:" + materia3);

        } else if (opcaoCadastro == 2) {
            System.out.println("### Cadastro de Notas ###");
        } else {
            System.out.println("Opção inválida.");
            System.out.println("Selecione [1] para cadastro de Aluno ou [2] para cadastro de Notas.");
        }
        System.out.println();

    }
}
