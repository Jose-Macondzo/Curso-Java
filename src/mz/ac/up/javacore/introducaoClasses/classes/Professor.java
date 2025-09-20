package mz.ac.up.javacore.introducao.classes;

public class Professor {
    private String nome;
    private int idade;
    private String identidade;

    public Professor() {
    }

    public Professor(String nome, int idade, String identidade) {
        this.nome = nome;
        this.idade = idade;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", identidade='" + identidade + '\'' +
                '}';
    }
}
