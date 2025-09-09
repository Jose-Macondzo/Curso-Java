package mz.ac.up.Consolidacao01.ControleFluxo;

import java.util.Scanner;

public class ControleFluxo4Exercicio {
    public static void main(String[] args) {
        byte dia;
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe um da semana 1-7: ");
        dia = leia.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Dia Invalido!");
                break;
        }
    }
}
