package com.mycompany.tostring;
public class Carro {
    
    String marca = "Ford";
    String modelo = "Mustang";
    String cor = "vermelho";
    int ano = 2021;
    
    /*Sobreposição do método toString do Java para exibir os dados do obejto
      em String, em vez de mostrar o endereço de memória do obejto*/
    
    public String toString(){
        
        return marca + "\n" + modelo + "\n" + cor + "\n" + ano;
    }
}
