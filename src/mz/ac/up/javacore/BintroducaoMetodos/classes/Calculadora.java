package mz.ac.up.javacore.BintroducaoMetodos.classes;

public class Calculadora {
    public int somaDois(int numero1, int numero2){
        int soma = numero1 + numero2;
        return soma;
    }

    public int subtraiDois(int numero1, int numero2){
        return numero1 - numero2;
    }

    public int multiplicaDois(int numero1, int numero2){
        return numero1 * numero2;
    }

    public int somaTodos(int[] numeros) {
        int soma = 0;
        for (int aux : numeros) {
            soma += aux;
        }
    return soma;
    }

    public int somaVarArgs(int... numeros){
        int soma = 0;
        for (int aux : numeros) {
            soma += aux;
        }
        return soma;
    }
}
