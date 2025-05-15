package com.mycompany.arraylist2djava;
import java.util.*;
public class ArrayList2DJava {

    public static void main(String[] args) {
        /* Um ArrayList 2D é uma lista de listas dinâmica, em que você pode 
         * mudar o tamanho dessas listas durante a execução
           
           Um array múltiplo dentro de outro
        */
        //ArrayList 2D
        ArrayList<ArrayList<String>> listaCompras = new ArrayList();        
        
        ArrayList<String> listaPadaria = new ArrayList();
        listaPadaria.add("pão");
        listaPadaria.add("sonho");
        listaPadaria.add("donuts");
        
        ArrayList<String> listaFrutaria = new ArrayList<>();
        listaFrutaria.add("banana");
        listaFrutaria.add("mamão");
        listaFrutaria.add("tomate");
        
        ArrayList <String> listaBebidas = new ArrayList<String>();
        listaBebidas.add("sprite");
        listaBebidas.add("café");
        
        //Adicionando arrays os ArrayList 2D
        listaCompras.add(listaPadaria);
        listaCompras.add(listaFrutaria);
        listaCompras.add(listaBebidas);
        
        //exibe o ArrayList completo
        System.out.println(listaCompras);
        
        //exibe o 1º índice do 1º array
        System.out.println(listaCompras.get(0).get(0));
    }
}
