package mz.ac.up.javacore.Kenum.testes;

import mz.ac.up.javacore.Kenum.classes.Cliente;
import mz.ac.up.javacore.Kenum.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Kelvia", TipoCliente.PESSOA_FISICA,TipoCliente.APRAZO);

        System.out.println(cliente);

        cliente.setTipo(TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);

    }
}
