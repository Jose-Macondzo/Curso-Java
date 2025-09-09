package mz.ac.up.Trabalhos;

public class MainAtm {
    public static void main(String[] args) {
        /**
         * Programa simula um caixa eletronico com as seguintes opcoes:
         * 1.Verificar Saldo
         * 2.Depositar Dinheiro
         * 3.Levantar Dinheiro
         * 4.Transferir Dinheiro
         * 5.Mudar o Pin
         * 0.Sair do Caixa
         */

        Atm inicializar = new Atm();
        inicializar.menu();
    }
}