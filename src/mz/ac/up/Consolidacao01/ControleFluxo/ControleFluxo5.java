package mz.ac.up.Consolidacao01.ControleFluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        //for
        /**
         * Imprimir numeros pares entre 1 e 10.000.
         * imprimir multiplos de 3 entre 1 - 1000.
         */
        int intervalo = 10000;
        int pares = 0;

        for (int i = 0; i <= intervalo; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero par: " + i);
                pares++;
            }else{
                continue;
            }
        }
        System.out.println("Os pares sao: "+pares);
        System.out.println("Os impares sao: "+(intervalo-pares));
    }
}
