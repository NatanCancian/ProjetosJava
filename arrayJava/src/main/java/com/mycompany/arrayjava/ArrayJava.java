
package com.mycompany.arrayjava;

public class ArrayJava {

    public static void main(String[] args) {
        
        /* O Array é usado para armazenar múltiplos valores dentro 
           de uma única variável
           para se acessar um elemento específico do array se numera 
           o [], ex: dia[2] = "Segunda";
        
           Quando se atribui valor ao array todos devem ser do mesmo 
           tipo de dado para serem consistentes
        */    
        
        // Formas de armazenar valores em um array
        
        String carros[] = {"Camaro","Corvette","Dodge"};
        
        String[] veiculos = new String[3];
        
        veiculos[0] = "Mercedes";
        veiculos[1] = "BMW";
        veiculos[2] = "Mustang";
        
        for(int i = 0; i < carros.length; i++){
            System.out.println(carros[i]);
        }
    }
}
