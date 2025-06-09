package com.mycompany.escopo;

public class Escopo {
    /* Escopo local = Declarado dentro do método, visível somente para aquele
       método
        
       Escopo global = Declarado fora do método mas dentro da classe, visível 
       para a classe inteira */
    public static void main(String[] args) {
        JogarDado Dado = new JogarDado();
    }
}
