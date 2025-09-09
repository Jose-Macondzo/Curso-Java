package mz.ac.up.Consolidacao01.Arrays;

import javax.swing.*;

public class Arrays2 {
    public static void main(String[] args) {
        int[] idades = new int[5];

        //para preencher
        for (int i = 0; i < idades.length; i++) {
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade "+(i+1)));
            System.out.println("Na posicao "+i+" : "+idades[i]);
        }

//        idades[0] = 19;
//        idades[1] = 22;
//        idades[2] = 25;
//        idades[3] = 30;
//        idades[4] = idades[0];


        //Impressao do Array

        String idadesImprime = "";

        for (int i = 0; i < idades.length; i++) {
            idadesImprime += "Idade " + (i + 1) + ": " + idades[i] + "\n";
        }

        System.out.println(idadesImprime);
        JOptionPane.showMessageDialog(null,idadesImprime);

        for(int aux : idades){
            System.out.println(aux);
            JOptionPane.showMessageDialog(null, aux);
        }

//        System.out.println("Idade 1: " + idades[0]);
//        System.out.println("Idade 2: " + idades[1]);
//        System.out.println("Idade 3: " + idades[2]);
//        System.out.println("Idade 4: " + idades[3]);
//        System.out.println("Idade 5: " + idades[4]);



    }
}
