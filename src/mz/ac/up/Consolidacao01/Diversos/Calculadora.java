package mz.ac.up.Consolidacao01.Diversos;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique o primeiro numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique o segundo numero"));

        //Soma
        JOptionPane.showMessageDialog(null,"Soma: "+(numero1+numero2)+
                "\nProduto: "+(numero1*numero2)+
                "\nSubtracao: "+(numero1-numero2)+
                "\nDivisao: "+(numero1/numero2));
    }
}
