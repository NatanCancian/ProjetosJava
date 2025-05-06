package com.mycompany.calculadorahipotenusa;

import java.util.Scanner;

public class CalculadoraHipotenusa {

    double x = 0; double y = 0; double z = 0;

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("||||||||||||||||||||||||||");
        System.out.println("CALCULADORA DE HIPOTENUSA");
        System.out.println("||||||||||||||||||||||||||");
        System.out.println("Coloque o tamanhho do lado X:");
        System.out.println("||||||||||||||||||||||||||");
        double x = entrada.nextDouble();
        System.out.println("||||||||||||||||||||||||||");
        System.out.println("Coloque o tamanho do lado Y:");
        System.out.println("||||||||||||||||||||||||||");
        double y = entrada.nextDouble();
        System.out.println("||||||||||||||||||||||||||");
        
        // sqrt - raiz quadrada // pow - potência
        double z = Math.sqrt((Math.pow(x, x) + Math.pow(y, y)));
        System.out.println("O valor da hipotenusa é: " + z);
        System.out.println("||||||||||||||||||||||||||");
        entrada.close();
    }
}
