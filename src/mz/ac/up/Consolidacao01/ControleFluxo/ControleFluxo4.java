package mz.ac.up.Consolidacao01.ControleFluxo;

import java.util.Scanner;

public class ControleFluxo4 {
    public static void main(String[] args) {
        /**
         *-Switch
         * Faca um programa que recebe um numero 1 - 7
         * Deve ao receber esse numero dizer se é:
         * dia Util ou Final de semana usando Switch.
         */

        byte diaSemana;
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe um dia da semana: ");
        diaSemana = leia.nextByte();

        switch (diaSemana) {
            case 1:
                System.out.println("Hoje é domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda-Feira.");
                break;
            case 3:
                System.out.println("Hoje é Terca-Feira.");
                break;
            case 4:
                System.out.println("Hoje é Quarta-Feira.");
                break;
            case 5:
                System.out.println("Hoje é Quinta-Feira.");
                break;
            case 6:
                System.out.println("Hoje é Sexta-Feira.");
                break;
            case 7:
                System.out.println("Hoje é Sabado.");
                break;
            default:
                System.out.println("Esse de semana nao existe!");
                break;
        }
    }
}
