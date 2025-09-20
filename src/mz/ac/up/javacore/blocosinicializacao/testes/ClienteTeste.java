package mz.ac.up.javacore.blocosinicializacao.testes;

import mz.ac.up.javacore.blocosinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente jose = new Cliente();

        System.out.println("Quantidade de parcelas disponiveis:");
        for(int aux : jose.getParcelas()){
            System.out.print(aux + " ");
        }
    }
}
