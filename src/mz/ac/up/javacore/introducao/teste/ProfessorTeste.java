package mz.ac.up.javacore.introducao.teste;

import mz.ac.up.javacore.introducao.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio Chongola", 28, "11115641585M");
        System.out.println(mauricio.toString());

        mauricio.setNome("Mauricio Henrique");
        System.out.println(mauricio.toString());

        mauricio.setIdade(25);
        System.out.println("Idade atual: " + mauricio.getIdade());
    }
}
