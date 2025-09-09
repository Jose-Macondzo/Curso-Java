package mz.ac.up.Trabalhos;

import java.util.Random;
import java.util.Scanner;

public class JogoTabuleiro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random baralhar = new Random();

        int tamanhoTabuleiro = 5;

        int colunaTesouro;
        int linhaTesouro;

        colunaTesouro = baralhar.nextInt(tamanhoTabuleiro);
        linhaTesouro = baralhar.nextInt(tamanhoTabuleiro);

        System.out.println("Jogo do Tesouro");
        System.out.println("Este jogo é um jogo do tabuleiro, encontre o tesouro!" +
                "Voce tem 3 Tentativas");
        System.out.println("Digita linha e coluna (valores de 0 a 5)");

        boolean encontrou = false;

        for (int tentativas = 1; tentativas <= 3; tentativas++) {
            System.out.println("Tentativa: " + tentativas + " : ");

            System.out.print("Linha (0 - 5): ");
            int linha = leia.nextInt();

            System.out.print("Coluna (0 - 5): ");
            int coluna = leia.nextInt();

            if (linha == linhaTesouro && coluna == colunaTesouro) {
                System.out.println("Parabens!! Voce encontrou o tesouro!!");
                encontrou = true;
                break;
            } else {
                String dica = "";

                if (linha < linhaTesouro) {
                    dica += "Baixo ";
                } else if (linha > linhaTesouro) {
                    dica += "Cima ";
                }

                if (coluna < colunaTesouro) {
                    dica += "Direita ";
                } else if (coluna > colunaTesouro) {
                    dica += "Esquerda ";
                }
                System.out.println("Dica! Vá para -> " + dica);
            }

        }
        if (!encontrou) {
            System.out.println("Fim do jogo! O tesouro estava em (" + colunaTesouro + ";" + linhaTesouro + ")");
        }
        leia.close();
    }
}
