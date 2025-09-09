package mz.ac.up.Consolidacao01.Arrays;

import java.util.Scanner;

public class Arrays6Exercicio {
    /**
     * Criar um programa que:
     * recebe nomes e numero de estudante de 5 estudantes
     * recebe 3 notas de cada
     * Calcula a media de cada
     * imprime a media e a classificacao
     * <9.5 chumbou
     * >9.5 e <13.4 vai a exame
     * >14 Dispensa
     */
    int totalEstudantes = 5;
    String[] nome = new String[totalEstudantes];
    String[] numeroEstudante = new String[totalEstudantes];
    double[][] notas = new double[totalEstudantes][3];
    double[] media = new double[totalEstudantes];
    String[] classificacao = new String[]{"Reprova", "Dispensa", "Vai a exame"};
    String[] classifica = new String[totalEstudantes];
    Scanner leia = new Scanner(System.in);

    public void registarEstudantes() {
        System.out.println("----------Registo de Estudantes----------");

        for (int i = 0; i < totalEstudantes; i++) {
            System.out.println("Informe o nome do " + (i + 1) + " estudante: ");
            nome[i] = leia.nextLine();

            System.out.println("Infome o numero de estudante do(a) " + nome[i] + ": ");
            numeroEstudante[i] = leia.nextLine();

            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Infome a nota " + (j + 1) + " do(a) " + nome[i] + ": ");
                notas[i][j] = leia.nextDouble();
            }

            leia.nextLine();
        }
        System.out.println("Registou " + totalEstudantes + " estudantes com sucesso!!");
    }

    public void calcularMedia() {
        for (int i = 0; i < totalEstudantes; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                media[i] += notas[i][j];
                System.out.println("Media "+(i+1)+": "+media[i]);
            }
            media[i] = media[i] / 3;
            System.out.println("Media " + (i + 1) + ": " + media[i]);
        }
    }

    public void classicarEstudantes() {
        for (int i = 0; i < totalEstudantes; i++) {
            if (media[i] < 9.5) {
                classifica[i] = classificacao[0];
            } else if (media[i] >= 9.5 && media[i] < 13.5) {
                classifica[i] = classificacao[2];
            } else {
                classifica[i] = classificacao[1];
            }
        }
    }

    public void imprimeClassificacao() {
        calcularMedia();
        classicarEstudantes();
        System.out.println("-------------------------------------Pauta-------------------------------------");
        System.out.println("Nome\t\t\tNumero estudante\tNota 1\tNota 2\tNota 3\t" +
                "Media\tClassificao");
        for (int i = 0; i < totalEstudantes; i++) {
            System.out.println(nome[i]+"\t"+numeroEstudante[i]+"\t\t"+
                    notas[i][0]+"\t"+
                    notas[i][1]+"\t"+
                    notas[i][2]+"\t"+
                    String.format("%.2f",media[i])+"\t"+
                    classifica[i]);
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}
