package mz.ac.up.javacore.Fmodificadorstatic.classes;

public class Calculadora {
    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int subtrai(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplica(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static String divide(double numero1, double numero2) {
        if (numero2 != 0) {
            return (numero1 / numero2) + "";
        } else {
            return "Impossivel dividir por 0!";
        }
    }

}
