package mz.ac.up.javacore.introducaosobrecargametodos.classes;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String identidade;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public void init(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void init(String nome, String endereco, String telefone, String email) {
        init(nome, endereco, telefone);
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Contacto: " + getTelefone());
        System.out.println("Email: " + getEmail());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", identidade='" + identidade + '\'' +
                '}';
    }

    /**
     * Crie uma classe "Pessoa" e de atributos que acha que
     * uma pessoa deve ter.
     * crie uma classe teste e crie algumas pessoas.
     */
}
