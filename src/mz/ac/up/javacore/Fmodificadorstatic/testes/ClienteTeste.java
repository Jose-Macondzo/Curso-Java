package mz.ac.up.javacore.Fmodificadorstatic.testes;

import mz.ac.up.javacore.Fmodificadorstatic.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        System.out.println("Quantidade de parcelas disponiveis:");
        for(int aux : Cliente.parcelas){
            System.out.print(aux + " ");
        }
    }
}
