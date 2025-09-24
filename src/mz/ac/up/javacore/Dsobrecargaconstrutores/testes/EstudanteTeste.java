package mz.ac.up.javacore.Dsobrecargaconstrutores.testes;

import mz.ac.up.javacore.Dsobrecargaconstrutores.Classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante est = new Estudante("Mauricio",'M',"112345");
        System.out.println(est.toString());

        Estudante est1 = new Estudante("Luis",'M',"1351551");
        System.out.println(est1.toString());

        Estudante est2 = new Estudante("Kelvia",'F',"464565","Informatica");
        System.out.println(est2.toString());
    }
}
