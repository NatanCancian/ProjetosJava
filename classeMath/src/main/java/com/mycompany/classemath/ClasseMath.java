
package com.mycompany.classemath;

public class ClasseMath {

    public static void main(String[] args) {
        double x = - 3.14;
        double y = 10.4;
        
        //pega o maior valor da fórmula
        double z = Math.max(x, y);
        
        //pega o menor valor da fórmula
        double a = Math.min(x, y);
        
        // pega o valor absoluto(valor real, sem o negativo(basicamente um not))
        double b = Math.abs(y);
        
        //pega a raiz quadrada
        double c = Math.sqrt(y);
        
        // arredonda o valor (pra baixo se for menor que a metade)
        //                   (pra cima se for maior que a metade )
        double d = Math.round(y);
        
        //arredonda sempre o valor pra cima
        double e = Math.ceil(y);
        
        //arredonda sempre o valor pra baixo
        double f = Math.floor(y);
        
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
