package mz.ac.up.Trabalhos.Biblioteca.classes;

public class Maria extends Revista{
    private int paginas;

    public Maria(String titulo, int ano, int edicao, int paginas) {
        super(titulo, ano, edicao);
        this.paginas = paginas;
    }

    public Maria() {
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public void imprimir() {
        System.out.println("Titulo: "+ this.getTitulo());
        System.out.println("Ano: "+ this.getAno());
        System.out.println("Edicao: "+ this.getEdicao());
        System.out.println("Paginas: "+ this.paginas);
    }
}
