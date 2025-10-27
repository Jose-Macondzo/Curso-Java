package mz.ac.up.Trabalhos.Biblioteca.classes;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacao> publicacoes;

    {
        publicacoes = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
    public Biblioteca(){}

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public void exibirInfo() {
        System.out.println("Publicacoes na biblioteca: ");
        if (!this.publicacoes.isEmpty()) {
            for (Publicacao publicacao : this.publicacoes) {
                publicacao.imprimir();
                System.out.println("---------------------");
            }
        } else {
            System.out.println("A biblioteca esta vazia!");
        }
    }

    public void adicionar(Poema poema) {
        this.publicacoes.add(poema);
        System.out.println("O Livro " + poema.getTitulo() + " foi adicionado.");
    }

    public void adicionar(Maria maria) {
        this.publicacoes.add(maria);
        System.out.println("A Revista " + maria.getTitulo() + " foi adicionada.");
    }

    public void pesquisar(String titulo) {
        for (Publicacao publicacao : this.publicacoes) {
            if(publicacao.getTitulo().equalsIgnoreCase(titulo)){
                publicacao.imprimir();
            }else{
                System.out.println("Publicacao inexistente na biblioteca!");
            }
        }
    }
}
