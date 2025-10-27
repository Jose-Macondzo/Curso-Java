package mz.ac.up.javacore.Kenum.classes;

public class Cliente {

    private String nome;
    private TipoCliente tipo;
    private TipoCliente tipoPagameto;

    public Cliente(String nome, TipoCliente tipo, TipoCliente tipoPagameto) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagameto = tipoPagameto;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public TipoCliente getTipoPagameto() {
        return tipoPagameto;
    }

    public void setTipoPagameto(TipoCliente tipoPagameto) {
        this.tipoPagameto = tipoPagameto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", tipoPagameto=" + tipoPagameto +
                '}';
    }
}
