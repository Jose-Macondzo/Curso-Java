package mz.ac.up.javacore.introducaoClasses.classes;

public class Calculadora {

    public void somaDois(int numero1, int numero2) {
        System.out.println("A soma " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
    }

    public void subtraiDois(int numero1, int numero2) {
        System.out.println("A subtracao " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
    }

    public void multiplicaDois(int numero1, int numero2) {
        System.out.println("O produto " + numero1 + " x " + numero2 + " = " + (numero1 * numero2));
    }

    public void divideDois(int numero1, int numero2) {
        if (numero2 == 0) {
            System.out.println("Impossivel dividir por 0!");
        } else {
            System.out.println("O quociente " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        }
    }
}
