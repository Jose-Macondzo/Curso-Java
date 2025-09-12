package mz.ac.up.Consolidacao01.Arrays;

import java.util.Scanner;

public class Arrays7 {
    String jogador = "X";

    public void trocaJogador(){
        if(jogador.equals("X")){
            jogador = "O";
        }else{
            jogador = "X";
        }
    }
    public static void main(String[] args) {
        String[][] tabuleiro = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = " ";
            }
        }


        System.out.println(
                " " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] +
                        "\n---|---|---\n" +
                        " " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] +
                        "\n---|---|---\n" +
                        " " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]
        );

        Scanner scanner = new Scanner(System.in);
        int posicao;
        int jogadas = 8;
        Arrays7 array = new Arrays7();
        do {
            posicao = scanner.nextInt();

            if (posicao == 1) {
                tabuleiro[2][0] = array.jogador;
            } else if (posicao == 2) {
                tabuleiro[2][1] = array.jogador;
            } else if (posicao == 3) {
                tabuleiro[2][2] = array.jogador;
            } else if (posicao == 4) {
                tabuleiro[1][0] = array.jogador;
            } else if (posicao == 5) {
                tabuleiro[1][1] = array.jogador;
            } else if (posicao == 6) {
                tabuleiro[1][2] = array.jogador;
            } else if (posicao == 7) {
                tabuleiro[0][0] = array.jogador;
            } else if (posicao == 8) {
                tabuleiro[0][1] = array.jogador;
            } else if (posicao == 9) {
                tabuleiro[0][2] = array.jogador;
            }
            jogadas--;
            System.out.println(
                    " " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] +
                            "\n---|---|---\n" +
                            " " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] +
                            "\n---|---|---\n" +
                            " " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]
            );
            array.trocaJogador();
        } while (jogadas != 0);

    }
}

