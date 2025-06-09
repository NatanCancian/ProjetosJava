package com.mycompany.construtor;
public class Pessoa {

    String nome;
    int idade;
    double peso;

    //Método Construtor 
    //Parâmetros
    Pessoa(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;             
    }
    
    void comer(){
        System.out.println(this.nome + " Está comendo");
    }
    
    void beber(){
        System.out.println(this.nome + " Está bebendo");
    }
}
