package mz.ac.up.Consolidacao01.ControleFluxo;

import java.util.Scanner;

public class ControleFluxo3 {
    public static void main(String[] args) {
        /**
         * Criar uma variavel salario e vamos imprimir o seu imposto:
         * salario < 1000 5% imposto
         * salario >= 1000 && salario < 2000 10%
         * salario >= 2000 && salario < 5000 15%
         * salario >= 5000 20%
         */
        Scanner ler = new Scanner(System.in);
        float salario;
        float imposto;

        System.out.print("Qual o seu salario: ");
        salario = ler.nextFloat();

        if (salario < 1000) {
            imposto = (float) 5 / 100;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = (float) 10 / 100;
        } else if (salario >= 2000 && salario < 5000) {
            imposto = (float) 15 / 100;
        } else {
            imposto = (float) 20 / 100;
        }
        System.out.println("Imposto Deduzido: "+(salario * imposto));
        salario -= (salario * imposto);
        System.out.println("O seu salario depois de deduzidos os impostos é: " + salario);
    }
}
