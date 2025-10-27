public class Publicacao {
    private String titulo;
    private int ano;

    public Publicacao() {
    }

    public Publicacao(String titulo) {
        this.titulo = titulo;
    }

    public Publicacao(String titulo, int ano) {
        this(titulo);
        this.ano = ano;
    }

    public Publicacao(Publicacao publicacao) {
        this(publicacao.titulo, publicacao.ano);
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

    public void exibirInfo() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Ano: " + this.ano);
    }
}
