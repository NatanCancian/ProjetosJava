package com.mycompany.construtorsobrecarregado;
/*Caso o objeto seja gerado faltando parâmetros a sobrecarga possibilita lidar
  com esta situação */
public class Pizza {

    String massa = null;
    String molho = null;
    String queijo = null;
    String cobertura = null;
    
    Pizza(){
        
    }
    
    Pizza(String massa){
        this.massa = massa;
    }
    
    Pizza(String massa,String molho){
        this.massa = massa;
        this.molho = molho;
    }
    
    Pizza(String massa,String molho, String queijo){
        this.massa = massa;
        this.molho = molho;
        this.queijo = queijo;
    }
    
    Pizza(String massa,String molho, String queijo, String cobertura){
        this.massa = massa;
        this.molho = molho;
        this.queijo = queijo;
        this.cobertura = cobertura;
    }
}
