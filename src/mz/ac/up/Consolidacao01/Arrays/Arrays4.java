package mz.ac.up.Consolidacao01.Arrays;

public class Arrays4 {
    public static void main(String[] args) {

        int[] numeros = new int[]{1, 2, 3, 5, 4};
        int[] numeros2 = {1, 2, 3, 5, 4};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        String[] nome = {"Julia", "mz/ac/up/Mauricio", "José Albino", "Kelvin"};

        for (String aux : nome) {
            if (aux.equalsIgnoreCase("Kelvia")) {
                System.out.println("Nome " + aux + " encontrado! ");
                break;
            } else {
                System.out.println("Nome nao encontrado!");
                break;
            }
        }

    }
}
