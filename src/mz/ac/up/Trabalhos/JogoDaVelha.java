package mz.ac.up.Trabalhos;

import java.util.Scanner;

public class JogoDaVelha {

    private String[] tabuleiro;
    private String jogadorAtual;


    public JogoDaVelha() {
        tabuleiro = new String[9];
        for (int i = 0; i < 9; i++) {
            tabuleiro[i] = " ";
        }
        jogadorAtual = "X";
    }


    public void imprimirTabuleiro() {
        System.out.println(" " + tabuleiro[0] + " | " + tabuleiro[1] + " | " + tabuleiro[2]);
        System.out.println("---|---|---");
        System.out.println(" " + tabuleiro[3] + " | " + tabuleiro[4] + " | " + tabuleiro[5]);
        System.out.println("---|---|---");
        System.out.println(" " + tabuleiro[6] + " | " + tabuleiro[7] + " | " + tabuleiro[8]);
    }


    public boolean jogar(int posicao) {
        if (posicao < 1 || posicao > 9 || !tabuleiro[posicao - 1].equals(" ")) {
            System.out.println("Jogada inválida. Tente novamente.");
            return false;
        }
        tabuleiro[posicao - 1] = jogadorAtual;
        return true;
    }


    public void alternarJogador() {
        if (jogadorAtual.equals("X")) {
            jogadorAtual = "O";
        } else {
            jogadorAtual = "X";
        }
    }


    public boolean verificarVitoria() {

        for (int i = 0; i < 3; i++) {

            if (tabuleiro[i * 3].equals(jogadorAtual) && tabuleiro[i * 3 + 1].equals(jogadorAtual) && tabuleiro[i * 3 + 2].equals(jogadorAtual)) {
                return true;
            }

            if (tabuleiro[i].equals(jogadorAtual) && tabuleiro[i + 3].equals(jogadorAtual) && tabuleiro[i + 6].equals(jogadorAtual)) {
                return true;
            }
        }

        if (tabuleiro[0].equals(jogadorAtual) && tabuleiro[4].equals(jogadorAtual) && tabuleiro[8].equals(jogadorAtual)) {
            return true;
        }
        if (tabuleiro[2].equals(jogadorAtual) && tabuleiro[4].equals(jogadorAtual) && tabuleiro[6].equals(jogadorAtual)) {
            return true;
        }
        return false;
    }


    public boolean verificarEmpate() {
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[i].equals(" ")) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo da Velha!");

        while (true) {
            jogo.imprimirTabuleiro();
            System.out.println("É a vez de " + jogo.jogadorAtual + ". Escolha uma posição entre 1 e 9:");
            int posicao = scanner.nextInt();

            if (jogo.jogar(posicao)) {
                if (jogo.verificarVitoria()) {
                    jogo.imprimirTabuleiro();
                    System.out.println("Jogador " + jogo.jogadorAtual + " venceu!");
                    break;
                } else if (jogo.verificarEmpate()) {
                    jogo.imprimirTabuleiro();
                    System.out.println("Empate!");
                    break;
                }
                jogo.alternarJogador();
            }
        }

        scanner.close();
    }
}


