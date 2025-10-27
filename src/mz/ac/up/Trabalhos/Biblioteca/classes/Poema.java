package mz.ac.up.Trabalhos.Biblioteca.classes;

public class Poema extends Livro{
    private String genero;

    public Poema(String titulo, int ano, String autor, String genero) {
        super(titulo, ano, autor);
        this.genero = genero;
    }

    public Poema() {
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Ano: "+this.getAno());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Genero: "+this.genero);
    }
}
