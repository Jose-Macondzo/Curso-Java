package mz.ac.up.Trabalhos.Biblioteca.classes;

public abstract class Publicacao {
    private String titulo;
    private int ano;

    public Publicacao(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public Publicacao() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract void imprimir();
}
