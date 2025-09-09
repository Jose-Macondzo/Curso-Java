package mz.ac.up.Consolidacao01.Diversos;

import java.util.ArrayList;

public class TiposPrimitivos {
    public static void main(String[] args) {

        //tipos numericos: inteiros
        int idade = 17;
        byte idade2 = 17;
        short idade3 = 9;

        long numeroCelualar = 877683528L;

        //tipos numericos: reais
        float altura = 1.70f;
        double peso = 105.9d;

        //tipos nao-numericos: texto

        char caracteres = 'X';
        //tipos nao-numericos: booleanos

        boolean casado = false;
        //tipos nao primitivos nao-numericos: objectos
        String texto = "mz/ac/up/Mauricio";

        ArrayList listaAlunos = new ArrayList();
        listaAlunos.add("mz/ac/up/Mauricio");
        listaAlunos.add("Macondzo");
        listaAlunos.add("Yuran");

        //etc...
        System.out.println(idade);
        System.out.println(idade2);
        System.out.println(idade3);
        System.out.println(numeroCelualar);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(caracteres);
        System.out.println(casado);
        System.out.println(texto);
        System.out.println(listaAlunos.toString());
    }
}
