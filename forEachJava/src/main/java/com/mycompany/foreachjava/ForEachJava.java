package com.mycompany.foreachjava;
import java.util.ArrayList;

public class ForEachJava {

    public static void main(String[] args) {
            /* O for-each é uma forma de atravessar pelos elementos de um array 
             *   ou coleção, menos etapas, mais legível, menos 
             *   flexível
             *
             *   String[] animais ={"Gato", "Pombo", "Rato", "Boi"};
             */
        
        ArrayList<String> animais = new ArrayList<String>();
        
        animais.add("Gato");
        animais.add("Pombo");
        animais.add("Rato");
        animais.add("Boi");
            
        for(String i : animais) {  // Para toda string nº i, do array animais 
            System.out.println(i); // tipo de dado, iterador, array desejado
                                   // irá contar uma vez cada elemento do array
        }                          // e imprimir      
    }
}
