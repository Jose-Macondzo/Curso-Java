package mz.ac.up.javacore.introducaoMetodos.classes;

public class Estudante {
    //Atributos
    private String nome;
    private int idade;
    private double[] notas;

    //Construtor completo
    public Estudante(String nome, int idade, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }
    //Construtor Vazio
    public Estudante() {
    }
    //Metodos Getter e Setter
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double... notas) {
        this.notas = notas;
    }
    //Metodo que calcula media
    public double calcularMedia() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        return media / notas.length;
    }
    //Classifica estudante
    public String classificarEstudante() {
        if (calcularMedia() >= 10) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    //Imprime os dados
    public void imprimirDados() {
        System.out.println("Nome do estudante: " + getNome());
        System.out.println("Idade do estudante: " + getIdade());
        System.out.print("Notas: ");
        for (double nota : getNotas()) {
            System.out.print(nota + "; ");
        }
        System.out.println(String.format("\nMedia do estudante: %.2f", calcularMedia()));
        System.out.println("Classificacao do estudante: " + classificarEstudante());
    }
}
