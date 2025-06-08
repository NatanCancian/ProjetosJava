package com.mycompany.metodos;

public class Metodos {
    // Métodos = bloco de código que executa sempre que é chamado
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 0;
        
        z = adicionar(x,y);
        System.out.println(z);
        
    /*  MÉTODOS COM PASSAGEM DE PARÂMETROS   
        String nome = "Jão"; 
        int idade = 30; 
        hello(nome, idade);
    }
    public static void hello(String nome,int id){
        System.out.println("Olá " + nome);
        System.out.println("Você tem " + id + " anos"); 
        
    VOID é um tipo de método sem retorno (ex: imprimir)*/
    
    } 
    static int adicionar(int x, int y){
        int z = 0;
        z = x + y;        
        return z;
        
        /*É possível retornar somente a soma sem armzenar em uma variável
          EX: return x + y ; */
    }
}
