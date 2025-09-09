package mz.ac.up.Consolidacao01.Arrays;

public class Arrays6ExercicioMain {
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
    public static void main(String[] args) {

        Arrays6Exercicio testa = new Arrays6Exercicio();
        testa.registarEstudantes();
        testa.imprimeClassificacao();
    }
}
