package com.mycompany.whilejava;
import java.util.Scanner;

public class WhileJava {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        String nome = "";
        byte idade = 0;
                        
        do{
                System.out.println("Digite seu nome");
                nome = entrada.nextLine(); 
        } while (nome.isBlank());
        System.out.println("Olá " + nome);
        
        while(idade == 0){
            System.out.println("Digite sua idade");
            idade = entrada.nextByte();
        
            /* Do While roda o código e valida no final
               While valida antes e aí roda o código 
            */
        }
        System.out.println("Você tem " + idade + " anos");
    }
}
