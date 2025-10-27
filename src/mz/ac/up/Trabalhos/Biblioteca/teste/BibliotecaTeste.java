package mz.ac.up.Trabalhos.Biblioteca.teste;

import mz.ac.up.Trabalhos.Biblioteca.classes.Biblioteca;
import mz.ac.up.Trabalhos.Biblioteca.classes.Maria;
import mz.ac.up.Trabalhos.Biblioteca.classes.Poema;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Poema poema1 = new Poema("Como criar um sistema em 1h",2025,"Jose Macondzo","Soneto");
        Poema poema2 = new Poema("Madrugadas em Java",2013,"Mauricio Chongola","Lirico");
        Poema poema3 = new Poema("Eu e o teclado",2024,"Yuran Omar","Dramatico");

        Maria maria1 = new Maria("Eu e meu eu",2006,130,30);
        Maria maria2 = new Maria("Autoestima jovem",2007,99,29);
        Maria maria3 = new Maria("Namoro Livre",2009,50,25);

        biblioteca.adicionar(poema1);
        biblioteca.adicionar(poema2);
        biblioteca.adicionar(poema3);

        biblioteca.adicionar(maria1);
        biblioteca.adicionar(maria2);
        biblioteca.adicionar(maria3);

        System.out.println(" ");

        biblioteca.exibirInfo();
    }
}
