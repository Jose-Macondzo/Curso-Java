package mz.ac.up.javacore.BintroducaoMetodos.teste;

import mz.ac.up.javacore.BintroducaoMetodos.classes.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste {
    /**
     * Crie uma classe estudante com os seguintes atributos: nome, idade, notas[3]
     * criar construtor completo e um vazio.
     * criar metodos getter and setter
     * criar um metodo para calcular a media
     * criar um metodo que classifica o estudante(>10 aprova e < 10 reprova)
     * criar um metodo para imprimir toda a informacao
     * criar 3 estudantes.
     * @param args
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner leia = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Informe o primeiro numero: ");
        numero1 = leia.nextInt();
        System.out.print("Informe o segundo numero: ");
        numero2 = leia.nextInt();

        System.out.println("A soma " + numero1 + " + " + numero2 + " = " + calc.somaDois(numero1, numero2));
        System.out.println("A diferenca " + numero1 + " - " + numero2 + " = " + calc.subtraiDois(numero1, numero2));
        System.out.println("O produto " + numero1 + " x " + numero2 + " = " + calc.multiplicaDois(numero1, numero2));

        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String valores = "";
        for (int aux : numeros) {
            valores += aux + ", ";
        }
        System.out.println("A soma dos valores (" + valores + ") é: " + calc.somaTodos(numeros));
//        System.out.println("A soma dos valores (" + valores + ") é: " + calc.somaVarArgs(numeros));
        System.out.println(calc.somaVarArgs(1,2,3,4,5,6,7,8,9));
    }
}
