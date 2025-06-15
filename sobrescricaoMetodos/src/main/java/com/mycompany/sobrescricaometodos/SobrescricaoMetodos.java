package com.mycompany.sobrescricaometodos;

public class SobrescricaoMetodos {
    /*Sobrescrição de métodos é quando um método é declarado em uma subclasse,
      já está presente na superclasse, logo a subclasse ganha a implementação 
      própria*/
    
    public static void main(String[] args) {
        Cachorro cao = new Cachorro();
        Animal sapo = new Animal();
        
        cao.falar();
        sapo.falar();
    }
}
