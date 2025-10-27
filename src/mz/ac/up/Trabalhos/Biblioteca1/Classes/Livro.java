package mz.ac.up.Trabalhos.Biblioteca1.Classes;

public class Livro extends Publicacao{
    private String autor;

    public Livro(){
        super();
    }
    public Livro(String titulo, int ano, String autor){
        super(titulo,ano);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Autor: "+this.autor);
    }
}
