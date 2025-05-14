package com.mycompany.array2djava;

public class Array2DJava {
    /* Um Array 2D é um Array duplo (linhas e colunas), cada 
       elemento armazenado possui uma posição de linha e coluna 
    */  
    public static void main(String[] args) {
        
        // Há 2 formas de inserir dados no array 2D
                
        String[][] carros = new String[3][3];
          
        carros[0][0] = "Camaro";
        carros[0][1] = "Corvette";
        carros[0][2] = "Mustang";
        carros[1][0] = "Silverado";
        carros[1][1] = "Ranger";
        carros[1][2] = "Hillux";
        carros[2][0] = "Ferrari";
        carros[2][1] = "Lamborghini";
        carros[2][2] = "Porsche";
        
        String[][] veiculos = { 
                                {"C3", "C4", "C5"},
                                {"DS3", "DS4", "DS5"}, 
                                {"206", "306", "406"} 
                              };      
        
        for(int i = 0; i < carros.length; i++){
            System.out.println();
            for(int j = 0; j < carros.length; j++){
                    System.out.print(carros[i][j] + " - ");
            }
        } 
        System.out.println("");
        for(int i = 0; i < veiculos.length; i++){
            System.out.println();
            for(int j = 0; j < veiculos.length; j++){
                    System.out.print(veiculos[i][j] + " - ");
            }
        }
    }
}
