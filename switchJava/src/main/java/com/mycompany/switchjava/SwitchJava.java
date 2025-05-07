package com.mycompany.switchjava;

public class SwitchJava {
    String dia = null;
    
    public static void main(String[] args) {
      String dia = "Segunda-Feira";  
        switch(dia){
            case "Domingo": System.out.println("É Domingo");   
            break;
            
            case "Segunda-Feira": System.out.println("É Segunda-Feira");   
            break;
            
            case "Terça-Feira": System.out.println("É Terça-Feira");   
            break;
            
            case "Quarta-Feira": System.out.println("Quarta-Feira");   
            break;
            
            case "Quinta-Feira": System.out.println("É Quinta-Feira");   
            break;
            
            case "Sexta-feira": System.out.println("É Sexta-feira");   
            break;
            
            case "Sábado": System.out.println("É Sábado");   
            break;
            
            default: System.out.println("Isso não é um dia");     
        }
    }
}
