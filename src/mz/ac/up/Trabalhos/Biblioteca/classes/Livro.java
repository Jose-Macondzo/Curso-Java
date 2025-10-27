package mz.ac.up.Trabalhos.Biblioteca.classes;

public abstract class Livro extends Publicacao {
    private String autor;

    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    public Livro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public abstract void imprimir();
}
