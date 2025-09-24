package mz.ac.up.javacore.Dsobrecargaconstrutores.Classes;

public class Estudante {
    private String nome;
    private char sexo;
    private String matricula;
    private String curso;

    public Estudante() {
    }

    public Estudante(String nome, char sexo, String matricula) {
        this.nome = nome;
        this.sexo = sexo;
        this.matricula = matricula;
    }

    public Estudante(String nome, char sexo, String matricula, String curso) {
        this(nome, sexo, matricula);
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String sexo = "";
        if(this.sexo == 'M'){
            sexo = "Masculino";
        }else{
            sexo = "Feminino";
        }
        return "Estudante{" +
                "nome='" + this.nome + '\'' +
                ", sexo=" + sexo +
                ", matricula='" + this.matricula + '\'' +
                ", curso='" + this.curso + '\'' +
                '}';
    }
}
