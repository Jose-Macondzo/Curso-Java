package mz.ac.up.Consolidacao01.Diversos;

import java.util.Scanner;

public class JogoDaVelha {

    private String[] tabuleiro; // Array que representa o tabuleiro
    private String jogadorAtual; // Jogador atual, pode ser "X" ou "O"

    // Construtor para inicializar o jogo
    public JogoDaVelha() {
        tabuleiro = new String[9]; // Tabuleiro tem 9 posições
        for (int i = 0; i < 9; i++) {
            tabuleiro[i] = " "; // Inicializa todas as posições com um espaço em branco
        }
        jogadorAtual = "X"; // O jogador "X" começa
    }

    // Método para imprimir o tabuleiro
    public void imprimirTabuleiro() {
        System.out.println(" " + tabuleiro[0] + " | " + tabuleiro[1] + " | " + tabuleiro[2]);
        System.out.println("---|---|---");
        System.out.println(" " + tabuleiro[3] + " | " + tabuleiro[4] + " | " + tabuleiro[5]);
        System.out.println("---|---|---");
        System.out.println(" " + tabuleiro[6] + " | " + tabuleiro[7] + " | " + tabuleiro[8]);
    }

    // Método para jogar, receber a posição e verificar se é válida
    public boolean jogar(int posicao) {
        if (posicao < 1 || posicao > 9 || !tabuleiro[posicao - 1].equals(" ")) {
            System.out.println("Jogada inválida. Tente novamente.");
            return false; // Jogada inválida
        }
        tabuleiro[posicao - 1] = jogadorAtual; // Coloca o marcador do jogador atual
        return true; // Jogada válida
    }

    // Método para alternar o jogador
    public void alternarJogador() {
        if (jogadorAtual.equals("X")) {
            jogadorAtual = "O"; // Se for X, passa para O
        } else {
            jogadorAtual = "X"; // Se for O, passa para X
        }
    }

    // Método para verificar se alguém ganhou
    public boolean verificarVitoria() {
        // Verifica linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            // Verifica linhas
            if (tabuleiro[i * 3].equals(jogadorAtual) && tabuleiro[i * 3 + 1].equals(jogadorAtual) && tabuleiro[i * 3 + 2].equals(jogadorAtual)) {
                return true;
            }
            // Verifica colunas
            if (tabuleiro[i].equals(jogadorAtual) && tabuleiro[i + 3].equals(jogadorAtual) && tabuleiro[i + 6].equals(jogadorAtual)) {
                return true;
            }
        }
        // Verifica diagonais
        if (tabuleiro[0].equals(jogadorAtual) && tabuleiro[4].equals(jogadorAtual) && tabuleiro[8].equals(jogadorAtual)) {
            return true;
        }
        if (tabuleiro[2].equals(jogadorAtual) && tabuleiro[4].equals(jogadorAtual) && tabuleiro[6].equals(jogadorAtual)) {
            return true;
        }
        return false;
    }

    // Método para verificar se o jogo terminou (empate ou vitória)
    public boolean verificarEmpate() {
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[i].equals(" ")) {
                return false; // Ainda há posições vazias, então o jogo não terminou
            }
        }
        return true; // Não há mais posições vazias, é empate
    }

    // Método principal para rodar o jogo
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
                    break; // Fim do jogo
                } else if (jogo.verificarEmpate()) {
                    jogo.imprimirTabuleiro();
                    System.out.println("Empate!");
                    break; // Fim do jogo
                }
                jogo.alternarJogador(); // Alterna para o próximo jogador
            }
        }

        scanner.close();
    }
}

