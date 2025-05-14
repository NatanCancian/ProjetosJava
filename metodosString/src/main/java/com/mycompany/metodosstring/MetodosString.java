package com.mycompany.metodosstring;
public class MetodosString {

    public static void main(String[] args) {
      String nome = ""; boolean resultado = false;
        /* String é um tipo de dado de referência(ou objeto) que pode armazenar 
           um ou mais caracteres, o tipo de dado de referência tem acesso a 
           métodos muito úteis. */
      
      nome = " ";
     /* resultado = nome.equalsIgnoreCase("zezao"); -> verifica se o contéudo
      * da string é igual ao que está dentro do parenteses e ignora Maiúsculas
      
      * resultado = nome.length(); -> retorna o tamanho de caracteres da String 
      
      * resultado = nome.charAt(0); -> pega o valor do índice char especificado
      
      * resultado = nome.indexOf("Z"); -> pega o valor da String onde o índice 
      * é igual ao que está dentro do parenteses 
     
      * resultado = nome.isEmpty(); -> verifica se a variável está vazia e 
      * retorna um boolean
      
      * resultado = nome.toLowerCase(); -> deixa tudo minúsculo
      
      * resultado = nome.toUpperCase(); -> deixa tudo maiúsculo
      
      * resultado = nome.trim(); -> remove espaços vazios em uma String
      
      * resultado = nome.replace('Z','A'); -> substitui onde houver o 1º 
      * caracter pelo 2º 
      
      * resultado = nome.isBlank(); -> verifica se a variável está em branco 
      * e retorna um boolean, em branco é ≠ de vazio */      
     
     resultado = nome.isBlank();
     System.out.println(resultado);
      
    }
}
