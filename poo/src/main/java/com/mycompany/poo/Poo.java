package com.mycompany.poo;

public class Poo {
    /*POO -> Programação Orientada à Objetos 
      Obejto = Instância de uma classe que pode conter atributos e métodos
      Ex: (celular, pc, mesa)
      É possível reutilizar uma classe para criar múltiplos objetos
      A classe funciona como um modelo */
    
    public static void main(String[] args) {
        // 2 Objetos de uma mesma classe
        Carro meuCarro = new Carro();
        Carro meu2Carro = new Carro();
        
        System.out.println(meuCarro.marca);
        System.out.println(meuCarro.modelo);
        System.out.println("");
        System.out.println(meu2Carro.marca);
        System.out.println(meu2Carro.modelo);
        
        meuCarro.dirigir();
        meuCarro.frear();
        
        meu2Carro.dirigir();
        meu2Carro.frear();
    }
}
