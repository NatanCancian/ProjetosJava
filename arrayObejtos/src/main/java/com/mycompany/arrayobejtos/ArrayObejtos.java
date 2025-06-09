package com.mycompany.arrayobejtos;

public class ArrayObejtos {

    public static void main(String[] args) {
        
      /* Uma forma de declarar o array de objeto e introduzir os objetos nele
        Cria o obejto do tipo array com tamanho fixo e adiciona cada objeto a 
        cada índice
        
        Comida[] geladeira = new Comida[3]; 
        
        geladeira[0] = comida1;
        geladeira[1] = comida2;
        geladeira[2] = comida3; 
      
        Outra forma Cria o objeto do tipo Array e adiciona os objetos de forma
        sequencial */
      
        Comida comida1 = new Comida("Pizza");
        Comida comida2 = new Comida("Pão");
        Comida comida3 = new Comida("Queijo");
        
        Comida[] geladeira  = {comida1, comida2, comida3};
        
        System.out.println(geladeira[0].nome);
        System.out.println(geladeira[1].nome);
        System.out.println(geladeira[2].nome);
        
    }
}
