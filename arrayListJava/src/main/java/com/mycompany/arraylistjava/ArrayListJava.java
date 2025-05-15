package com.mycompany.arraylistjava;
import java.util.ArrayList;
public class ArrayListJava {

    public static void main(String[] args) {
        
        /* O Arraylist é um array redimensionável, elementos podem ser 
         * adicionados ou removidos depois da fase de compilação e só guarda 
         * tipos de dados de referência(objetos) */
        
        ArrayList<String> comida = new ArrayList<String>();
        
        //2 Formas de adicionar dados ao ArrayList
        
        comida.add("pizza");
        comida.add("churrasco");
        comida.add("mac");
        
        comida.set(0, "Sushi");
                
        // comida.remove(2); -> Remove o índice indicado
        // comida.clear(); -> limpa o array inteiro
        
        for(int i= 0; i < comida.size(); i++){
            System.out.println(comida.get(i));
        }        
    }
}
