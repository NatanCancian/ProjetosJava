package com.mycompany.escopo;
import java.util.Random;
public class JogarDado {
    
    Random aleatorio;
    int numero = 0;
    
    JogarDado(){
        aleatorio = new Random();
        jogar();
    }
    
    void jogar(){
         numero = aleatorio.nextInt(6)+ 1;
         System.out.println(numero);
    }
}
