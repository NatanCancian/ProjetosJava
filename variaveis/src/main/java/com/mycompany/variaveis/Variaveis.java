package com.mycompany.variaveis;

public class Variaveis {
    
  byte x = 0; long y = 0; float z = 0; double a = 0; boolean b = false; 
  char simbolo = ' '; String nome = null; 
  
    public static void main(String[] args) {
       byte x = 123;
       long y = 1234567894563318L;
       float z = 3.14f;
       double a = 3.123456789;
       boolean b = true;
       char simbolo = '$';
       String nome = "Natan";
       
        System.out.println("Meu número é: " + x);
        System.out.println("Float igual a: " + y);
        System.out.println("número do π = " + z);
        System.out.println("Teste do Double " + a);
        System.out.println("A expressão é:" + b);
        System.out.println(simbolo);
        System.out.println("Oi " + nome);
    }
}
