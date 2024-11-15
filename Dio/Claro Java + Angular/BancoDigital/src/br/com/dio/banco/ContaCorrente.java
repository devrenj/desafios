package br.com.dio.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente, "corrente");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("### Extrato Conta Corrente ###");
        super.imprimirInfosComuns();
    }
}
