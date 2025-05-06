package com.mycompany.valoresaleatorios;

import java.util.Random;

public class ValoresAleatorios {
        int x = 0; double y = 0; boolean z = false;
   
        public static void main(String[] args) {
        
            Random aleatorio = new Random();
         
                int x = aleatorio.nextInt();
         
         /* * Se inserir um valor dentro de nextInt(), é possível 
            * delimitar um intervalo para o número a ser gerado
            * Ex nextInt(6) -> vai gerar números entre 0 e 5.
            * Para gerar de 1 a 6(dado de 6 lados) é só fazer desta forma
            * int x = aleatorio.nextInt(6) + 1; */
         
                double y = aleatorio.nextDouble();
         
                boolean z = aleatorio.nextBoolean();
         
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
       }
}
