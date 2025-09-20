package mz.ac.up.javacore.introducaoMetodos.teste;

import mz.ac.up.javacore.introducaoMetodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        //Criacao dos objetos do tipo Estudante
        Estudante luis = new Estudante();
        Estudante mauricio = new Estudante();
        double[] notasMacondzo = {12,11,9.25};
        Estudante macondzo = new Estudante("José Macondzo",30,notasMacondzo);

        //preenchimento dos atributos para o objeto luis
        luis.setNome("Luis Ranito");
        luis.setIdade(27);
        luis.setNotas(12.75,10.5,14.25);

        //preenchimento dos atributos para o objeto mauricio
        mauricio.setNome("Mauricio Chongola");
        mauricio.setIdade(27);
        mauricio.setNotas(7.45,11.25,9.75);

        //impressao dos objetos
        luis.imprimirDados();
        System.out.println("-------------------------");
        mauricio.imprimirDados();
        System.out.println("-------------------------");
        macondzo.imprimirDados();
    }
}
