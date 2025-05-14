package com.mycompany.loopaninhado;
import java.util.Scanner;
public class LoopAninhado {

    public static void main(String[] args) {
        
        // loop aninhado é um loop dentro de outro loop
        
        Scanner entrada = new Scanner(System.in);
        int linhas = 0; 
        int colunas = 0; 
        String simbolos = "";
        
        System.out.println("Digite o número de linhas");
        linhas = entrada.nextInt();
        
        System.out.println("Digite o número de colunas");
        colunas = entrada.nextInt();
        
        System.out.println("Digite um símbolo para uso");
        simbolos = entrada.next();
        
        for(int i = 1; i <= linhas; i++){
            System.out.println();
            for(int j = 1; j <= colunas; j++){
                System.out.print(simbolos);
            }
        }
    }
}
