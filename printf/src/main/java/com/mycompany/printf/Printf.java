package com.mycompany.printf;

public class Printf {
    /* printf() = Um método opcional para controle, formatação, e exibição de 
       texto no terminal, 
    
       Estrutura -> 2 argumentos = String formatada + (objeto/variável/valor)
       % flags, precisão, largura , conversão de caracteres (combinações)
    
       %letra -> adiciona um valor ao printf, pode estar no (), vir de 
        variável, objeto..  a posição determina onde irá aparecer 
        (MESMA LÓGICA PARA TODOS)
    
       %b -> adiciona um valor booleano ao printf
       %c -> adiciona um valor char ao printf
       %s -> adiciona um valor de string ao printf
       %d -> adiciona um valor de inteiro ao printf
       %f -> adiciona um valor de double ao printf */
       
    public static void main(String[] args) {
        
        boolean meuBooleano = true;
        char meuChar = '$';
        String minhaString = "Teste";
        int meuInt = 50;
        double meuDouble = 1000;
        
    /*  System.out.printf("%b",meuBooleano);
        System.out.printf(" %c",meuChar);
        System.out.printf(" %s",minhaString);
        System.out.printf(" %d",meuInt);
        System.out.printf(" %f",meuDouble);   
        System.out.printf("%d String formatada",123); */
        
    /*  LARGURA 
          Consegue definir o número específico de caracteres a serem escritos 
          na saída */
        
        System.out.printf("Olá %10s",minhaString);
        // Faz a variavel string ser exibida usando 10 caracteres
        // (se faltar adiciona espaços, se estourar trunca)
        
    /*  PRECISÃO
          Define um número de dígitos na saída com precisão quando imprime 
          valores ponto flutuante
          EX:*/ System.out.printf("Você possui %.2f ",meuDouble);
         /* (Exibirá 2 casas após a vírgula) */
        
    /*  FLAGS
          Adiciona um efeito na saída baseado na flag adicionada ao formato 
          específico
      \\  - : Alinhamento justificado a esquerda (String)
      \\  + : imprime um sinal de + ou de - para um número
      \\  0 : preenche os numeros com 0(inicio, antes da variavel)
      \\  ,: agrupamento de números por , se > 1000 */
    }
}
