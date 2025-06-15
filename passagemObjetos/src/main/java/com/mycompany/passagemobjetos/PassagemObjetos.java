package com.mycompany.passagemobjetos;

public class PassagemObjetos {

    public static void main(String[] args) {
        /* É possível passar obejtos como parâmetros, ao passar o objeto é 
           necessário especificar no método o objeto a ser usado */
           
        Garagem garagem = new Garagem();
        Carro carro = new Carro("BMW 320i");
        Carro carro2 = new Carro("Mercedes C63");
        
        garagem.estacionar(carro);
        garagem.estacionar(carro2);
        
    }
}
