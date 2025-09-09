package mz.ac.up.Consolidacao01.ControleFluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {
        /**
         * While e do do-While
         * imprimir multiplos de 7 entre 1 - 1000.
         */
        //1-while
        int idade = 12;
        int idade2 = 12;

        System.out.println("Dentro do while");
        while (idade < 12) {
            System.out.println("Nao pode votar." +
                    "Volte no proximo ano");
            idade++;
        }

        System.out.println("");

        System.out.println("Dentro do Do-while");
        do {
            System.out.println("Nao pode votar." +
                    "Volte no proximo ano");
            idade2++;
        } while (idade2 < 12);

    }
}
