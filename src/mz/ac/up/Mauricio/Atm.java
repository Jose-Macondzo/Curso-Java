package mz.ac.up.Mauricio;

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
     * Extrato para todas operacoes
     * Implementar JOptionPane
     */
    double saldo;
    String pin = "1111";
    boolean acesso = true;
    String extrato = "";

    public boolean isVerifica() {
        boolean estado = false;
        int tentativas = 3;
        String pin;

        if (acesso) {
            do {
                pin = JOptionPane.showInputDialog(null, "Informe o pin. " + tentativas + " tentativas!");

                if (pin.isBlank() || pin.length() != 4) {
                    JOptionPane.showMessageDialog(null, "O pin deve ter 4 digitos!");
                } else {
                    if (pin.equals(this.pin)) {
                        acesso = true;
                        estado = true;
                    } else {
                        if (tentativas == 1) {
                            JOptionPane.showMessageDialog(null, "Conta Bloqueada!");
                            acesso = false;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Pin Incorreto!");
                            tentativas--;
                            acesso = true;
                            continue;
                        }
                    }
                }
            } while (!estado);
        } else {
            acesso = false;
        }
        return acesso;
    }

    public void depositarDinheiro(double valor) {
        if (valor >= 100) {
            this.saldo += valor;
            this.extrato += "\n+" + valor + "Mt";
            JOptionPane.showMessageDialog(null, "Depositou " + valor + "Mt com sucesso!\n" +
                    "Saldo atual " + this.saldo + "Mt.");
        } else {
            JOptionPane.showMessageDialog(null, "So pode depositar valores acima de 99Mt");
        }

    }

    public void verificarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo da conta: " + this.saldo + "Mt");
    }

    public void levantarDinheiro(double valor) {
        if (valor > this.saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } else if (valor % 100 != 0) {
            JOptionPane.showMessageDialog(null, "So pode levantar multiplos de 100!");
        } else {
            this.saldo -= valor;
            this.extrato += "\n-" + valor + "Mt";
            JOptionPane.showMessageDialog(null, "Levantou " + valor + "Mt com sucesso" +
                    "\nSaldo Atual: " + this.saldo + "Mt");
        }
    }

    public void transferirDinheiro(double valor, String conta) {
        if (valor > this.saldo) {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        } else {
            this.saldo -= valor;
            this.extrato += "\n-" + valor + "Mt. Conta: "+conta;
            JOptionPane.showMessageDialog(null, "Transferiu " + valor + "Mt\nConta: " + conta + "\n\n" +
                    "Saldo Atual: " + this.saldo + "Mt");
        }
    }

    public void mudarPin() {
        String pin, pinConfir;
        if (isVerifica()) {
            do {
                pin = JOptionPane.showInputDialog("Informe o novo pin");
                if (pin.isBlank() || pin.length() != 4) {
                    JOptionPane.showMessageDialog(null, "O pin deve ter 4 digitos!");
                }
            } while (pin.isBlank() || pin.length() != 4);

            do {
                pinConfir = JOptionPane.showInputDialog("Confirme o novo pin");
                if (pinConfir.isBlank() || pinConfir.length() != 4) {
                    JOptionPane.showMessageDialog(null, "O pin deve ter 4 digitos!");
                }
            } while (pinConfir.isBlank() || pinConfir.length() != 4);

            if (pin.equals(pinConfir)) {
                this.pin = pin;
                this.extrato += "\nPin Alterado";
                JOptionPane.showMessageDialog(null, "Pin Alterado!");
            } else {
                JOptionPane.showMessageDialog(null, "Os pins que introduziu sao diferentes!");

            }
        }
    }

    public boolean sairCaixa() {
        JOptionPane.showMessageDialog(null, "Saiu do caixa", "Adeus", JOptionPane.INFORMATION_MESSAGE);
        return false;
    }

    public String imprimirExtrato() {
        return this.extrato;
    }

    public void inicializar() {
        byte opcao;

        if (isVerifica()) {
            do {
                opcao = Byte.parseByte(JOptionPane.showInputDialog(null, "" +
                        "1.Verificar Saldo" +
                        "\n2.Depositar Dinheiro" +
                        "\n3.Levantar Dinheiro" +
                        "\n4.Transferir Dinheiro" +
                        "\n5.Imprimir Extrato" +
                        "\n6.Mudar Pin" +
                        "\n0.Sair do Atm", "Menu", JOptionPane.QUESTION_MESSAGE));

                switch (opcao) {
                    case 1:
                        verificarSaldo();
                        break;
                    case 2:
                        depositarDinheiro(Double.parseDouble(JOptionPane.showInputDialog("Quanto pretende depositar")));
                        break;
                    case 3:
                        levantarDinheiro(Double.parseDouble(JOptionPane.showInputDialog("Quanto pretende levantar?")));
                        break;
                    case 4:
                        transferirDinheiro(Double.parseDouble(JOptionPane.showInputDialog("Quanto pretende transferir?")), JOptionPane.showInputDialog("Informe a Conta."));
                        break;
                    case 6:
                        mudarPin();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"Extrato Bancario\n"+ imprimirExtrato());
                        break;
                    case 0:
                        this.acesso = sairCaixa();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcao Invalida", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } while (this.acesso);
        }
    }
}
