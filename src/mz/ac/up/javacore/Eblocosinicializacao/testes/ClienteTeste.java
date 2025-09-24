package mz.ac.up.javacore.Eblocosinicializacao.testes;

import mz.ac.up.javacore.Eblocosinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente jose = new Cliente();

        System.out.println("Quantidade de parcelas disponiveis:");
        for(int aux : jose.getParcelas()){
            System.out.print(aux + " ");
        }
    }
}
