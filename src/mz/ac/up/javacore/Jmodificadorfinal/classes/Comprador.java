package mz.ac.up.javacore.Jmodificadorfinal.classes;

public class Comprador {
    private String nome;

    public Comprador(String nome) {
        this.nome = nome;
    }

    public Comprador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
