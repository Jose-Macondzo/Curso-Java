package mz.ac.up.Trabalhos.Biblioteca1.Classes;


import java.util.ArrayList;


public class Biblioteca2 {
    protected ArrayList<Publicacao> publicacoes;
    protected Livro livro;
    protected Revista revista;
    {
        publicacoes = new ArrayList<Publicacao>();
    }

    public Biblioteca2(){}

    public Biblioteca2(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
    public Biblioteca2(Livro livro){
        this.livro = livro;
        publicacoes.add(livro);
    }

    public Biblioteca2(Revista revista){
        this.revista = revista;
        publicacoes.add(revista);
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista lista) {
        this.revista = lista;
    }

    public void exibirInfo() {
        System.out.println("Obras na biblioteca:");
        for(Publicacao obra : publicacoes){

            System.out.println(obra.getTitulo());
            System.out.println(obra.getAno());
        }
    }

    public void imprimirLista() {
        System.out.println("Obras na biblioteca:");
        for (Publicacao obra : publicacoes) {
            System.out.println("Titulo: " + obra.getTitulo());
            System.out.println("Ano: " + obra.getAno());
            if(getLivro() == null){
                System.out.println("Author: Sem autor");
            }else{
                System.out.println("Author: " + getLivro().getAutor() );
            }
            if(getRevista() == null){

                System.out.println("Edicao: 0");
            }else{
                System.out.println("Edicao: " + getRevista().getEdicao());
            }
        }
    }

    public void adicionarPublicacao(Publicacao publicacao){
        publicacoes.add(publicacao);
        System.out.println("Publicacao adicionada com sucesso!");
    }

}
