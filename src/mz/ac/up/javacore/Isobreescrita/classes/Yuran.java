package mz.ac.up.javacore.Isobreescrita.classes;

public class Yuran extends Pessoa {
    private boolean cabelo;

    public Yuran(String nome, int idade, boolean cabelo) {
        super(nome, idade);
        this.cabelo = cabelo;
    }

    public Yuran() {
        super();
    }

    public boolean isCabelo() {
        return cabelo;
    }

    public void setCabelo(boolean cabelo) {
        this.cabelo = cabelo;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Tem cabelo: " + this.cabelo);
    }

    @Override
    public String toString() {
        super.toString();
        return "Yuran{" +
                "cabelo=" + cabelo +
                '}';
    }
}
