package com.mycompany.ifjava;

public class IfJava {
    byte idade = 0;
    
    public static void main(String[] args) {
        byte idade = 75;
        
        if(idade > 74){
            System.out.println("OK, Boomer!");
        } else if(idade > 17){
            System.out.println("Você é um adulto!");            
        } else if(idade > 13){
            System.out.println("Você é um adolescente");    
        } else{
            System.out.println("Você é uma criança");
        }       
    }
}
