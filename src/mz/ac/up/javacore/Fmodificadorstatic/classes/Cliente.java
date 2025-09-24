package mz.ac.up.javacore.Fmodificadorstatic.classes;

public class Cliente {
    public static final int[] parcelas;

    static{
        //bloco de inicializacao
        System.out.println("Dentro do bloco de inicializacao");
        parcelas = new int[100];
        for (int i = 0; i <= 99; i++) {
            parcelas[i] = i + 1;
        }
    }

    public Cliente() {
        System.out.println("Dentro do construtor");
        for (int aux : parcelas) {
            System.out.print(aux + " ");
        }
    }

    public Cliente(int[] parcelas) {
        System.out.println("Dentro do construtor");
        for (int aux : parcelas) {
            System.out.print(aux + " ");
        }
    }
}
