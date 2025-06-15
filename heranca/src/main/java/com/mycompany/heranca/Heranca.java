package com.mycompany.heranca;
public class Heranca {
    /*Herança é um processo no qual uma classe adquire os métodos e atributos
      variáveis de uma outra classe */
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Bicicleta bike1 = new Bicicleta();
        
        carro1.mover();
        bike1.parar();
        
        System.out.println(carro1.portas);
        System.out.println(bike1.pedais);
    }
}
