package mz.ac.up.Consolidacao01.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        //arrays multidimensionais
//        int[][] inteiros = new int[2][2];
//        int[] inteiros2[] = new int[][]{{0, 5}, {5, 0}};
//        int[] inteiros3[] = new int[2][];
//
//
//        for (int i = 0; i < inteiros2.length; i++) {
//            System.out.println("Array: "+(i+1));
//            for (int j = 0; j < inteiros2[i].length; j++) {
//                System.out.println(inteiros2[i][j]);
//            }
//        }

        /**
         * Criar um programa que:
         * recebe nomes e numero de estudante de 5 estudantes
         * recebe 3 notas de cada
         * Calcula a media de cada
         * imprime a media e a classificacao
         * <9.5 chumbou
         * >9.5 e <13.4 vai a exame
         * >14 Dispensa
         */

        int[][] numeros = new int[3][];

        numeros[0] = new int[]{1,2};
        numeros[1] = new int[]{2,3,4};

        numeros[2] = new int[]{7,18,9,5};

        int i = 1;
        for(int[] referencia : numeros){
            System.out.println("Array "+i+":");
            for(int aux : referencia){
                System.out.println(aux);
            }
            i++;
        }
     }
}
