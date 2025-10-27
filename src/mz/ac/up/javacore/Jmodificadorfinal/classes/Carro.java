package mz.ac.up.javacore.Jmodificadorfinal.classes;

public abstract class Carro {
    private String marca;
    private String nome;
    private static final int VELOCIDADE_MAXIMA;

    static {
        VELOCIDADE_MAXIMA = 180;
    }

    public Carro(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getVelocidadeMaxima() {
        return VELOCIDADE_MAXIMA;
    }

    @Override
    public abstract String toString();

    public final void imprimir() {

    }
}
