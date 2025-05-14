package com.mycompany.wrapperclasses;
public class WrapperClasses {

     public static void main(String[] args) {
        /* Wrapper Class = um jeito de transformar os tipos primitivos de dados
           em objetos ou(dado de referência), o objeto tem acesso a métodos 
           muito úteis que podem ser usados com coleções. Ex: arrayList.
         
        Primitivo   //Wrapper(Objeto) 
        ----------------------------
        byte           Byte
        boolean        Boolean
        char           Character
        int            Integer
        double         Double
        short          Short
        long           Long
        float          Float
              
        autoboxing = conversão automática que o compilador do Java faz entre o
        tipo primitivo e o Objeto correspondente(wrapper class), para acesso
        /utilização.
        
        unboxing = processo reverso do autoboxing,conversão automática do objeto
        (wrapper class) para o tipo primitivo, para acesso/utilização. 
        
        Em geral objetos são mais pesados e exigem mais recursos computacionais
        que o tipo primitivo de dados. */
                
        Boolean a = true; 
        Character b = '$';
        Integer c = 123;
        Double d = 3.14;
        String e = "Zezão";
        
        if(a == true){
            //exemplo do unboxing
            System.out.println(a);
        }
    }
}
