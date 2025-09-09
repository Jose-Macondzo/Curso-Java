package mz.ac.up.Consolidacao01.ControleFluxo;

public class ControleFluxo5Exercicio {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " / 3 = " + i / 3);
            }
        }
    }
}
