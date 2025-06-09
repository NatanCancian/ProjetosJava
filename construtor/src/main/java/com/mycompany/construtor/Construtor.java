package com.mycompany.construtor;
public class Construtor {
    //Construtor = Método especial que é chamado quando um objeto é instânciado
    
    public static void main(String[] args) {
        Pessoa Zezao1 = new Pessoa("Zezao",50,70);
        Pessoa Zezao2 = new Pessoa("Zezao2",20,60);
        
        System.out.println(Zezao1.nome);
        Zezao1.beber();
        System.out.println(Zezao2.peso);
        Zezao2.comer();
    }
}
