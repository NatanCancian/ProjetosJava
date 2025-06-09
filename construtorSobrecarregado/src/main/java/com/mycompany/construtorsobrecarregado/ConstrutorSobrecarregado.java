package com.mycompany.construtorsobrecarregado;

public class ConstrutorSobrecarregado {

    /* Construtor Sobrecarregado =  Múltiplos construtores dentro da classe com 
       o mesmo nome, mas parâmetros diferentes,
       nome + parâmetros = assinatura do método */

    public static void main(String[] args) {
        Pizza pizza = new Pizza("Borda fina", "tomate", "Mussarela", "Calabresa");
        
        Pizza pizza2 = new Pizza("Borda larga", "tomate", "Cheddar");
        
        System.out.println("Aqui estão os ingredientes da sua pizza");
        
        System.out.println(pizza.massa);
        System.out.println(pizza.molho);
        System.out.println(pizza.queijo);
        System.out.println(pizza.cobertura);
        
        System.out.println(pizza2.massa);
        System.out.println(pizza2.queijo);
    }
}
