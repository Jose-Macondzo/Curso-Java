package mz.ac.up.javacore.Eblocosinicializacao.classes;

public class Cliente {
    private int[] parcelas;

    {
        //bloco de inicializacao
        System.out.println("Dentro do bloco de inicializacao");
        parcelas = new int[100];
        for (int i = 0; i <= 99; i++) {
            parcelas[i] = i + 1;
        }
    }

    public Cliente() {
        System.out.println("Dentro do construtor");
        for (int aux : this.parcelas) {
            System.out.print(aux + " ");
        }
    }

    public Cliente(int[] parcelas) {
        System.out.println("Dentro do construtor");
        for (int aux : this.parcelas) {
            System.out.print(aux + " ");
        }
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
