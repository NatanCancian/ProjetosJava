package com.mycompany.interfacegraficabasica;
import javax.swing.JOptionPane;
public class InterfaceGraficaBasica {
    
    String nome = null; byte idade = 0; double altura = 0;
    
    public static void main(String[] args) {
     
        String nome = JOptionPane.showInputDialog("Escreva seu nome");
        JOptionPane.showMessageDialog(null, "Olá " + nome);
        
        byte idade = Byte.parseByte(JOptionPane.showInputDialog("Escreva sua idade"));
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos de idade");
     
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua altura"));
        JOptionPane.showMessageDialog(null, "Você tem " + altura + " cm de altura");
    }
}
