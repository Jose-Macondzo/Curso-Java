package mz.ac.up.javacore.Jmodificadorfinal.classes;

public class Subaru extends Carro {
    private String modelo;

    public Subaru(String marca, String nome, String modelo) {
        super(marca, nome);
        this.modelo = modelo;
    }

    public Subaru() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "marca='" + getMarca() + '\'' +
                "\nnome='" + getNome() + '\'' +
                "\nmodelo='" + this.modelo + '\'' +
                "\nvelocidade maxima='" + Carro.getVelocidadeMaxima() + '\'';
    }
}
