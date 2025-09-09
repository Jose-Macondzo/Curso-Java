package mz.ac.up.Consolidacao01.Arrays;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o nome "+(i+1)+":");
            nomes[i] = leia.next();
        }
        System.out.println("");
        System.out.println("******Imprimindo******");

        for(String imprime : nomes){
            System.out.println(imprime);
        }
    }
}
