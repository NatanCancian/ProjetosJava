package com.mycompany.trocandovariaveis;

public class TrocandoVariaveis {
    String x = null; String y = null; String temp = null;
    public static void main(String[] args) {
        
        String x = "água";
        String y = "cachaça";
        String temp = null;
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
