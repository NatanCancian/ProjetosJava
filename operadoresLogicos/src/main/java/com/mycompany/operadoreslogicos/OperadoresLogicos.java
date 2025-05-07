package com.mycompany.operadoreslogicos;
import java.util.Scanner;
public class OperadoresLogicos {
  
    
    public static void main(String[] args) {
        String resposta = null;
        /* Operadores lógicos são usados pra conectar 2 ou mais expressões
         *           && = (E) todas as condições precisam ser verdadeiras
         *           || = (OU) somente uma condição precisa ser verdadeira                          
         *            ! = (NÃO) inverte o valor lógico da expressão       */
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Pressione S ou s para sair");
         resposta = entrada.next();
        
        if(resposta.equals("S") || resposta.equals("s")){
            System.out.println("Você saiu");
            } 
            else if(!resposta.equals("E") && !resposta.equals("e")){
                System.out.println("Você errou a saída");
                }    
                    else{
                        System.out.println("Você não saiu");
      }
   }
}
