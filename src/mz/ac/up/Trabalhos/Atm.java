package mz.ac.up.Trabalhos;

import javax.swing.*;

public class Atm {
    /**
     * Ter saldo;
     * Verificar: Mostrar o saldo
     * Depositar: Verificar se o saldo nao é negativo, saldo > 100 depois dizer saldo
     * Levantar: minimo 100. ver se tem saldo suficiente depois dizer saldo
     * Transferir: ver se tem saldo suficiente depois dizer saldo
     * Menu
     * Password: mudar o pin, o pin deve ter 4 digitos,
     * Verificar para todas operacoes
     * Implementar JOptionPane
     */
    String pin = "0000";
    double saldo = 0;

    public boolean isVerifica() {
        String pin = "";
        int tentativas = 3;
        boolean estado = false;

        do {
            pin = JOptionPane.showInputDialog(null, "Informe o Pin. " + (tentativas) + " Tentativas!", "Autenticacao Caixa Eletronico", JOptionPane.QUESTION_MESSAGE);

            if (pin.length() != 4 || pin.isBlank()) {
                JOptionPane.showMessageDialog(null, "O pin deve ter 4 digitos!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {

                if (pin.equals(this.pin)) {
                    estado = true;
                    continue;
                } else {
                    JOptionPane.showMessageDialog(null, "Pin incorreto! ", "Pin Incorreto", JOptionPane.ERROR_MESSAGE);
                    if (tentativas == 1) {
                        estado = false;
                        JOptionPane.showMessageDialog(null, "Conta Bloqueada!", "Bloqueada", JOptionPane.WARNING_MESSAGE);
                        break;
                    } else {
                        tentativas--;
                        estado = false;
                        continue;
                    }
                }
            }
        } while (!estado);
        return estado;
    }

    public void mudarPin() {
        String pinNovo;
        String pinConfirma;

        JOptionPane.showMessageDialog(null, "Informe o seu pin atual");
        if (isVerifica()) {
            do {
                do {
                    pinNovo = JOptionPane.showInputDialog(null, "Informe o seu pin Novo");
                    if (pinNovo.length() != 4 || pinNovo.isBlank()) {
                        JOptionPane.showMessageDialog(null, "O pin deve ter 4 digitos!", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                } while (pinNovo.length() != 4 || pinNovo.isBlank());


                do {
                    pinConfirma = JOptionPane.showInputDialog(null, "Informe mais uma vez o seu pin Novo");
                    if (pinConfirma.length() != 4 || pinConfirma.isBlank()) {
                        JOptionPane.showMessageDialog(null, "O pin deve ter 4 digitos!", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                } while (pinConfirma.length() != 4 || pinConfirma.isBlank());

                if (pinNovo.equals(pinConfirma)) {
                    this.pin = pinNovo;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Os pins que informou sao diferentes!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } while (!pinNovo.equals(pinConfirma));
            JOptionPane.showMessageDialog(null, "Pin alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            isVerifica();
        }

    }

    public void depositar(double valor) {
        if (valor < 20) {
            JOptionPane.showMessageDialog(null, "Valor invalido para desposito!", "Valor Invalido", JOptionPane.ERROR_MESSAGE);
        } else {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depositou " + valor + "Mt com sucesso.\nSaldo atual " + saldo + "Mt", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void transferir(double valor, String conta) {
        if (valor > this.saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para operacao! \n" +
                    "Saldo atual " + saldo + "Mt", "Saldo Insuficiente", JOptionPane.ERROR_MESSAGE);
        } else {
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Tranferiu " + valor + "Mt para conta " + conta + "\n" +
                    "Saldo Atual " + this.saldo, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void levantar(double valor) {
        if (valor > this.saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para operacao! \n" +
                    "Saldo atual " + saldo + "Mt", "Saldo Insuficiente", JOptionPane.ERROR_MESSAGE);
        } else if (valor < 100) {
            JOptionPane.showMessageDialog(null, "Valor minimo é 100Mt", "Erro", JOptionPane.WARNING_MESSAGE);
        } else if (valor % 100 != 0) {
            JOptionPane.showMessageDialog(null, "So pode levantar valores multiplos de 100!", "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Levantou " + valor + "Mt com sucesso!" + "\n" +
                    "Saldo Atual " + this.saldo, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void verificaSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo atual " + this.saldo + "Mt", "Saldo da Conta", JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean isSairAtm() {
        return false;
    }

    public void menu(){
        boolean acesso = true;
        byte opcao = 0;
        if (isVerifica()) {
            while (acesso) {

                opcao = Byte.parseByte(JOptionPane.showInputDialog(null, "1.Verificar saldo" +
                        "\n2.Depositar dinheiro" +
                        "\n3.Levantar Dinheiro" +
                        "\n4.Transferir Dinheiro" +
                        "\n5.Mudar o Pin" +
                        "\n0.Sair do Atm", "Menu", JOptionPane.QUESTION_MESSAGE));

                switch (opcao) {
                    case 1:
                        verificaSaldo();
                        break;
                    case 2:
                        depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto pretende depositar?", "Deposita?", JOptionPane.QUESTION_MESSAGE)));
                        break;
                    case 3:
                        levantar(Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto pretende levantar?", "Levanta?", JOptionPane.QUESTION_MESSAGE)));
                        break;
                    case 4:
                        transferir(Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto pretende transferir?", "Transfere?", JOptionPane.QUESTION_MESSAGE)), JOptionPane.showInputDialog(null, "Informe a conta destino", "Conta?", JOptionPane.QUESTION_MESSAGE));
                        break;
                    case 5:
                        mudarPin();
                        break;
                    case 0:
                        acesso = isSairAtm();
                        JOptionPane.showMessageDialog(null, "Saiu do Caixa!", "Adeus", JOptionPane.WARNING_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcao Invalida! Tente novamente.", "Opcao Invalida", JOptionPane.WARNING_MESSAGE);
                        break;
                }
            }
        } else {
            acesso = false;
        }
    }
}


