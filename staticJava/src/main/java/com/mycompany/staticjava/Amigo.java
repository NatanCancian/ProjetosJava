package com.mycompany.staticjava;
public class Amigo {
    
    String nome = null;
    static int numeroDeAmigos = 0;  
    
    Amigo(String nome){
        this.nome = nome;
        
    numeroDeAmigos++;
    }
        static void mostrarAmigos(){
        System.out.println("Você possui " + numeroDeAmigos + " amigos");
    }

}
