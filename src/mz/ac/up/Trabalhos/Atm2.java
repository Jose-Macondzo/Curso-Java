package mz.ac.up.Trabalhos;

import javax.swing.*;

public class Atm2 {
    /**
     * ---Atm---
     * Depositar dinheiro
     * Levantar dinheiro
     * Transferir dinheiro
     * Mostrar saldo
     * imprimir extrato
     * Em seguranca, ter autenticacao
     */
    String pin = "1111";
    double saldo;
    String extrato = "";
    boolean acesso = true;

    public boolean isVerifica() {
        boolean estado = false;
        String pin;
        int tentativas = 3;

        if (this.acesso) {
            do {
                pin = JOptionPane.showInputDialog("Informe o pin. " + tentativas + " tentativas.");

                if (pin.equals(this.pin)) {
                    estado = true;
                    continue;
                } else {
                    if (tentativas == 1) {
                        JOptionPane.showMessageDialog(null, "Conta Bloqueada!");
                        this.acesso = false;
                        estado = false;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Pin Incorreto!");
                        tentativas--;
                        estado = false;
                    }
                }
            } while (!estado);
        }
        return estado;
    }

    public void verificarSaldo() {
        JOptionPane.showMessageDialog(null, "O saldo é: " + this.saldo + "Mt.");
    }

    public void depositarDinheiro(double valor) {
        if (valor > 99) {
            this.saldo += valor;
            extrato += "\n+" + valor + "Mt.";
            JOptionPane.showMessageDialog(null, "Depositou " + valor + "Mt com Sucesso.\n" +
                    "Saldo atual: " + this.saldo + "Mt");
        } else {
            JOptionPane.showMessageDialog(null, "So depositar acima de 100Mt");
        }
    }

    public void levantarDinheiro(double valor) {
        if (valor > this.saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } else if (valor < 100) {
            JOptionPane.showMessageDialog(null, "So pode levantar apartir de 100Mt");
        } else if (valor % 100 != 0) {
            JOptionPane.showMessageDialog(null, "So pode levantar multiplos de 100.");
        } else {
            this.saldo -= valor;
            extrato += "\n-" + valor + "Mt.";
            JOptionPane.showMessageDialog(null, "Levantou " + valor + "Mt com Sucesso!\n" +
                    "Saldo atual: " + this.saldo + "Mt");
        }
    }

    public void transferirDinheiro(double valor, String conta) {
        if (valor > this.saldo) {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        } else {
            this.saldo -= valor;
            extrato += "\n-" + valor + "Mt. Conta: " + conta;
            JOptionPane.showMessageDialog(null, "Transferiu " + valor + "Mt para conta " + conta + " com sucesso!\n" +
                    "Saldo atual: " + this.saldo);
        }
    }

    public void imprimirExtrato() {
        JOptionPane.showMessageDialog(null, "Extrato Bancario\n" + this.extrato);
    }

    public boolean sairCaixa(){
        return false;
    }

    public void inicializar() {
        byte opcao;

        if (isVerifica()) {
            do {
                opcao = Byte.parseByte(JOptionPane.showInputDialog("" +
                        "1.Verificar Saldo" +
                        "\n2.Depositar Dinheiro" +
                        "\n3.Levantar Dinheiro" +
                        "\n4.Transferir Dinheiro" +
                        "\n5.Imprimir Extrato" +
                        "\n0.Sair do Caixa"));

                switch (opcao) {
                    case 1:
                        verificarSaldo();
                        break;
                    case 2:
                        depositarDinheiro(Double.parseDouble(JOptionPane.showInputDialog("Quanto pretende depositar?")));
                        break;
                    case 3:
                        levantarDinheiro(Double.parseDouble(JOptionPane.showInputDialog("Quanto pretende levantar?")));
                        break;
                    case 4:
                        transferirDinheiro(Double.parseDouble(JOptionPane.showInputDialog("Quanto pretende transferir?")), JOptionPane.showInputDialog("Informe a conta"));
                        break;
                    case 5:
                        imprimirExtrato();
                        break;
                    case 0: this.acesso = sairCaixa();break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcao invalida!");
                        break;
                }
            } while (this.acesso);
        }

    }
}
