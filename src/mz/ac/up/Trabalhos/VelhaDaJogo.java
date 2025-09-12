package mz.ac.up.Trabalhos;

import java.util.Scanner;

public class VelhaDaJogo {
    String[][] tabuleiro;
    String jogadorAtual;

    public VelhaDaJogo() {
        tabuleiro = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = " ";
            }
        }
        jogadorAtual = "X";
    }

    public void imprimeTabuleiro() {
        System.out.println("  " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] +
                "\n ---|---|---" +
                "\n  " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] +
                "\n ---|---|---" +
                "\n  " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]);
    }

    public boolean jogar(int posicao) {
        if (posicao < 1 || posicao > 9) {
            System.out.println("Jogada Invalida. Tente novamente");
            return false;
        } else {
            if (posicao == 7) {
                tabuleiro[0][0] = jogadorAtual;
            } else if (posicao == 8) {
                tabuleiro[0][1] = jogadorAtual;
            } else if (posicao == 9) {
                tabuleiro[0][2] = jogadorAtual;
            } else if (posicao == 4) {
                tabuleiro[1][0] = jogadorAtual;
            } else if (posicao == 5) {
                tabuleiro[1][1] = jogadorAtual;
            } else if (posicao == 6) {
                tabuleiro[1][2] = jogadorAtual;
            } else if (posicao == 1) {
                tabuleiro[2][0] = jogadorAtual;
            } else if (posicao == 2) {
                tabuleiro[2][1] = jogadorAtual;
            } else if (posicao == 3) {
                tabuleiro[2][2] = jogadorAtual;
            }
        }
        return true;
    }

    public void trocarJogador() {
        if (jogadorAtual.equals("X")) {
            jogadorAtual = "O";
        } else {
            jogadorAtual = "X";
        }
    }

    public boolean verificarVencedor() {

        if (tabuleiro[0][0].equals(jogadorAtual) && tabuleiro[0][1].equals(jogadorAtual) && tabuleiro[0][2].equals(jogadorAtual)) {
            return true;
        }
        if (tabuleiro[1][0].equals(jogadorAtual) && tabuleiro[1][1].equals(jogadorAtual) && tabuleiro[1][2].equals(jogadorAtual)) {
            return true;
        }
        if (tabuleiro[2][0].equals(jogadorAtual) && tabuleiro[2][1].equals(jogadorAtual) && tabuleiro[2][2].equals(jogadorAtual)) {
            return true;
        }
        if (tabuleiro[0][0].equals(jogadorAtual) && tabuleiro[1][0].equals(jogadorAtual) && tabuleiro[2][0].equals(jogadorAtual)) {
            return true;
        }
        if (tabuleiro[0][1].equals(jogadorAtual) && tabuleiro[1][1].equals(jogadorAtual) && tabuleiro[2][1].equals(jogadorAtual)) {
            return true;
        }
        if (tabuleiro[0][2].equals(jogadorAtual) && tabuleiro[1][2].equals(jogadorAtual) && tabuleiro[2][2].equals(jogadorAtual)) {
            return true;
        }
        if (tabuleiro[0][0].equals(jogadorAtual) && tabuleiro[1][1].equals(jogadorAtual) && tabuleiro[2][2].equals(jogadorAtual)) {
            return true;
        }
        if (tabuleiro[2][0].equals(jogadorAtual) && tabuleiro[1][1].equals(jogadorAtual) && tabuleiro[0][2].equals(jogadorAtual)) {
            return true;
        }
        return false;
    }

    public boolean verificarEmpate(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(tabuleiro[i][j].equals(" ")){
                    return false;
                }
            }
        }
    return true;
    }


    public static void main(String[] args) {
        VelhaDaJogo jogo = new VelhaDaJogo();
        Scanner jogada = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo da Velha!");

        while(true){
            jogo.imprimeTabuleiro();
            System.out.println("Agora é a vez do jogador: "+jogo.jogadorAtual+". Escolha uma posicao de 1 a 9.");
            int posicao = jogada.nextInt();

            if(jogo.jogar(posicao)){
                if(jogo.verificarVencedor()){
                    jogo.imprimeTabuleiro();
                    System.out.println("O jogador "+jogo.jogadorAtual+" venceu!");
                    break;
                }else if(jogo.verificarEmpate()){
                    jogo.imprimeTabuleiro();
                    System.out.println("O jogo foi empatado");
                    break;
                }else{
                    jogo.trocarJogador();
                }
            }

        }
        jogada.close();
    }
}
