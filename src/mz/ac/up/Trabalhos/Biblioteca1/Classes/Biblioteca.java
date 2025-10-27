package mz.ac.up.Trabalhos.Biblioteca1.Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Revista> revistas;

    {
        livros = new ArrayList<>();
        revistas = new ArrayList<>();
    }

    public Biblioteca() {
    }

    public Biblioteca(ArrayList<Livro> livros, ArrayList<Revista> revistas) {
        this.livros = livros;
        this.revistas = revistas;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Revista> getRevistas() {
        return revistas;
    }

    public void setRevistas(ArrayList<Revista> revistas) {
        this.revistas = revistas;
    }

    public void imprimir() {
        System.out.println("Livros na biblioteca:");
        System.out.println("---------------------------------------------");
        System.out.println("Titulo\t\t\t|Author\t\t\t|Ano");
        System.out.println("---------------------------------------------");
        for (Livro livro : this.livros) {
            System.out.println(livro.getTitulo() + "\t\t\t|" + livro.getAutor() + "\t|" + livro.getAno());
        }
        System.out.println("---------------------------------------------");
        System.out.println("Total de livros\t| " + this.livros.size());
        System.out.println("---------------------------------------------");

        System.out.println(" ");

        System.out.println("Revistas na biblioteca: ");
        System.out.println("---------------------------------------------");
        System.out.println("Titulo\t\t\t|Edicao\t\t\t|Ano");
        System.out.println("---------------------------------------------");
        for (Revista revista : this.revistas) {
            System.out.println(revista.getTitulo() + "\t\t\t|" + revista.getEdicao() + "\t\t\t|" + revista.getAno());
        }
        System.out.println("---------------------------------------------");
        System.out.println("Total de revistas: " + this.revistas.size());
        System.out.println("---------------------------------------------");
        System.out.println(" ");
        System.out.println("---------------------------------------------");
        System.out.println("Total de obras na biblioteca\t| " + (livros.size() + revistas.size()));
        System.out.println("---------------------------------------------");
    }

    public void adicionarPublicacao(Livro livro) {
        this.livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void adicionarPublicacao(Revista revista) {
        this.revistas.add(revista);
        System.out.println("Revista adicionada com sucesso!");
        System.out.println(" ");
    }

    public int escolherPublicacao() {
        Scanner leia = new Scanner(System.in);
        int resposta;
        System.out.println("Que obra deseja adicionar: \t\n1. Livro\n2. Revista?");
        leia.nextLine();
        resposta = leia.nextInt();
        return resposta;
    }

    public ArrayList<Livro> buscarPublicacaoLivro(String titulo) {
        ArrayList<Livro> lista = new ArrayList<>();
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                lista.add(livro);
            }
        }
        if (lista.isEmpty()) {
            return null;
        }
        return lista;
    }

    public ArrayList<Revista> buscarPublicacaoRevista(String titulo) {
        ArrayList<Revista> lista = new ArrayList<>();
        for (Revista revista : this.revistas) {
            if (revista.getTitulo().equalsIgnoreCase(titulo)) {
                lista.add(revista);
            }
        }
        if (lista.isEmpty()) {
            return null;
        }
        return lista;
    }
}
