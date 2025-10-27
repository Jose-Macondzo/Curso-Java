package mz.ac.up.Trabalhos.Biblioteca1.Classes;

public class Revista extends Publicacao{
    private int edicao;

    public Revista(){
        super();
    }
    public Revista(String titulo, int ano, int edicao){
        super(titulo, ano);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Edicao: "+this.edicao);
    }
}
