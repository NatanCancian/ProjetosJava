package com.mycompany.tostring;

public class ToString {
    /* toString() = método especial que todos os objetos herdam, retorna uma 
       string que "textualmente representa" um objeto. Pode ser usado de forma
       implícita ou explícita 
       Por padrão imprime o endereço na memória do objeto. */
    
    public static void main(String[] args) {
        Carro veiculo = new Carro();
        
    /* System.out.println(veiculo.toString());
       Sem o método configurado imprime o endereço de memória do objeto veículo
       toString explicito */
        
        System.out.println(veiculo);
        // toString implícito
    }
}
