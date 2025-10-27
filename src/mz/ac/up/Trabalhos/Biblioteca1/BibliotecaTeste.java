package mz.ac.up.Trabalhos.Biblioteca1;

import mz.ac.up.Trabalhos.Biblioteca1.Classes.Biblioteca;
import mz.ac.up.Trabalhos.Biblioteca1.Classes.Livro;
import mz.ac.up.Trabalhos.Biblioteca1.Classes.Revista;

import java.util.Scanner;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner leia = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1. Introduzir Publicacao" +
                    "\n2. Listar Publicacoes" +
                    "\n3. Pesquisar Publicacao" +
                    "\n4. Duplicar ultimo registo" +
                    "\n5. Sair");

            opcao = leia.nextInt();
            switch (opcao) {
                case 1:
                    if (biblioteca.escolherPublicacao() == 1) {
                        System.out.println("Qual o titulo do livro?");
                        leia.nextLine();
                        String titulo = leia.nextLine();
                        System.out.println("Qual o ano de publicacao?");
                        int ano = leia.nextInt();
                        System.out.println("Quem o autor do livro?");
                        leia.nextLine();
                        String autor = leia.nextLine();
                        Livro livro = new Livro(titulo, ano, autor);
                        biblioteca.adicionarPublicacao(livro);
                    } else if (biblioteca.escolherPublicacao() == 2) {
                        System.out.println("Qual o titulo da revista?");
                        leia.nextLine();
                        String titulo = leia.nextLine();
                        System.out.println("Qual o ano de publicacao?");
                        int ano = leia.nextInt();
                        System.out.println("Qual e' a edicao?");
                        int edicao = leia.nextInt();
                        Revista revista = new Revista(titulo, ano, edicao);
                        biblioteca.adicionarPublicacao(revista);
                    } else {
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 2:
                    biblioteca.imprimir();
                    break;
                case 3:
                    System.out.println("Qual o titulo da obra?");
                    leia.nextLine();
                    String titulo = leia.nextLine();
                    if (biblioteca.buscarPublicacaoLivro(titulo) != null) {
                        System.out.println("Livros encontrados: ");
                        System.out.println("---------------------------------------------");
                        System.out.println("Titulo\t\t\t|Author\t\t\t|Ano");
                        System.out.println("---------------------------------------------");
                        for (Livro livro : biblioteca.buscarPublicacaoLivro(titulo)) {
                            System.out.println(livro.getTitulo() +
                                    "\t\t\t|" + livro.getAutor() + "\t\t\t|" +
                                    livro.getAno());
                        }
                        System.out.println("---------------------------------------------");

                    }
                    ;
                    if (biblioteca.buscarPublicacaoRevista(titulo) != null) {
                        System.out.println("Revistas encontradas: ");
                        System.out.println("---------------------------------------------");
                        System.out.println("Titulo\t\t\t|Edicao\t\t\t|Ano");
                        System.out.println("---------------------------------------------");
                        for (Revista revista : biblioteca.buscarPublicacaoRevista(titulo)) {
                            System.out.println(revista.getTitulo() +
                                    "\t\t\t|" + revista.getEdicao() +
                                    "\t\t\t|" + revista.getAno());
                        }
                        System.out.println("---------------------------------------------");
                    }
                    ;
                    if (biblioteca.buscarPublicacaoLivro(titulo) == null && biblioteca.buscarPublicacaoRevista(titulo) == null) {
                        System.out.println("Publicacao nao encontrada!");
                    }
                    break;
                case 4:
                    System.out.println("Deseja dublicar a(o) ultima(o):\n1. Livro?\n2. Revista?");
                    leia.nextLine();
                    int resposta = leia.nextInt();
                    if (resposta == 1){
                        if(!biblioteca.getLivros().isEmpty()){
                            biblioteca.adicionarPublicacao(biblioteca.getLivros().getLast());
                        }else{
                            System.out.println("A biblioteca ainda nao tem nenhum livro!");
                        }
                    } else if (resposta == 2) {
                        if(!biblioteca.getRevistas().isEmpty()){
                            biblioteca.adicionarPublicacao(biblioteca.getRevistas().getLast());
                        }else{
                            System.out.println("A biblioteca ainda nao tem nenhuma revista!");
                        }
                    }else{
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 5:
                    System.out.println("Saiu!");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        } while (opcao != 5);
    }
}
