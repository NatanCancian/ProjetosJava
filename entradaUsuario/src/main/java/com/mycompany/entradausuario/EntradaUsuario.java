package com.mycompany.entradausuario;

import java.util.Scanner;

public class EntradaUsuario {
    
    byte idade = 0; String nome = null; String comida = null;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        
        System.out.println("Qual é sua idade? ");
        byte idade = scanner.nextByte();
        
        scanner.nextLine();
        //Esse comando vai limpar o scanner para poder 
        // receber a nova entrada de dados
        
        System.out.println("Qual é sua comida favorita? ");
        String comida = scanner.nextLine();
        
        System.out.println("Olá " + nome);
        System.out.println("Você possui " +idade+ " anos");
        System.out.println("Você gosta de " + comida);
    }
}
