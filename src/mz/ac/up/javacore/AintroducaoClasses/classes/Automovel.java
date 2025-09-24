package mz.ac.up.javacore.AintroducaoClasses.classes;

public class Automovel {
    private String marca;
    private String matricula;
    private String modelo;

    public Automovel(){}

    public Automovel(String marca, String matricula, String modelo) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public Automovel(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
    }

    public Automovel(String marca) {
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getModelo() {
        return this.modelo;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
