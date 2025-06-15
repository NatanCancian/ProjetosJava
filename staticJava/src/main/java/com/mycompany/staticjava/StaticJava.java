package com.mycompany.staticjava;
public class StaticJava {
    /*O Static é um modificador, uma cópia da variável/método é criada e 
      compartilhada e a classe é "dona" do item estático, o acesso deve ser
      de forma estática nomeClasse.elemento*/
    
    public static void main(String[] args) {
 
    Amigo amigo1 = new Amigo("Bob Esponja");
    Amigo amigo2 = new Amigo("Patrick Estrela");
    Amigo amigo3 = new Amigo("Lula Molusco");
    Amigo amigo4 = new Amigo("Sandy");
        
    //Acesso ao método de forma estática
        Amigo.mostrarAmigos();
    }
}
