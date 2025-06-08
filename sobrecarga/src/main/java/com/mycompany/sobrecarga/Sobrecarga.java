package com.mycompany.sobrecarga;

public class Sobrecarga {

    /* Sobrecarga de métodos -> métodos que possuem o mesmo nome mas tem
       parâmetros diferentes 
    
       ASSINATURA DE MÉTODO == nome do método + parâmetros(tipo de dados, 
       número de parâmetros e ordem de passagem) */
    
    public static void main(String[] args) {  
        
       double x = adicionar(1.0,2.0);
       int y = adicionar(1,2,3);
       double z = adicionar(1,2,3.0,4.0);
       
       System.out.println(x + y + z);
    }
    
    static int adicionar(int a, int b){
        System.out.println("Método sobrecarregado Nº1");
            return a + b;                
    }
    static int adicionar(int a, int b, int c){
        System.out.println("Método sobrecarregado Nº2");
            return a + b + c;                
    }
    static int adicionar(int a, int b, int c, int d){
        System.out.println("Método sobrecarregado Nº3");
            return a + b + c + d;                 
    }
     static double adicionar(double a, double b){
        System.out.println("Método sobrecarregado Nº4");
            return a + b;                
    }
    static double adicionar(double a, double b, double c){
        System.out.println("Método sobrecarregado Nº5");
            return a + b + c;                
    }
    static double adicionar(double a, double b, double c, double d){
        System.out.println("Método sobrecarregado Nº6");
            return a + b + c + d;        
    }
}