package com.mycompany.sobrescricaometodos;

public class Cachorro extends Animal{

    //Notação que indica a sobrescrita(Boa prática)
    @Override
    void falar(){
        System.out.println("O cachorro vai latir");
    }
}
