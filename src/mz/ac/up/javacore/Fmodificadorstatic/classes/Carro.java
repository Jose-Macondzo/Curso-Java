package mz.ac.up.javacore.Fmodificadorstatic.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite;

    {
        velocidadeLimite = 90;
    }

    public Carro() {
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir() {
        System.out.println("-----------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima + "Km/h");
        System.out.println("Velocidade limite: " + velocidadeLimite + "Km/h");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
