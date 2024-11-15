package br.com.dio.banco;

public abstract class Conta implements InterfaceConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected String tipoConta;
    protected Cliente cliente;

    public Conta(Cliente cliente, String tipoConta) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.saldo = 0;
        this.tipoConta = tipoConta;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.sacar(valor, false);
    }

    public void sacar(double valor, boolean isTransferencia) {
            String mensagem = "Saque solicitado...";
        if (this.saldo >= valor) {
            this.saldo -= valor;
            mensagem += String.format("\nSaque no valor de R$%.2f efetuado com sucesso.", valor);
        } else {
            mensagem += "\nSaque negado: Saldo insuficiente";
        }

        if (!isTransferencia) {
            System.out.println(mensagem);
        }
    }

    @Override
    public void depositar(double valor) {
        this.depositar(valor, false);
    }

    public void depositar(double valor, boolean isTransferencia) {
        this.saldo += valor;
        if (!isTransferencia) {
            System.out.println(String.format("Você realizou um depósito no valor de R$%.2f", valor));
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        System.out.println("Transferência solicitada...");
        if (this.saldo >= valor && contaDestino != null) {
            this.sacar(valor, true);
            contaDestino.depositar(valor, true);
            System.out.println(String.format("Transferência realizada com sucesso!" +
                    "\n### Dados da Transferência ###" +
                    "\nValor Transferido: R$%.2f" +
                    "\nConta Destino: %s" +
                    "\nTipo da Conta Destino: %s" +
                    "\nCliente: %s" +
                    "\nSaldo atual da sua conta: R$%.2f",
                    valor, contaDestino.getNumeroConta(), contaDestino.getTipoConta(),
                    contaDestino.cliente.getNome(), this.getSaldo()));
        } else if (this.saldo < valor) {
            System.out.println("Transferência negada: Saldo insuficiente");
        } else if (contaDestino == null) {
            System.out.println("Transferência negada: Conta de destino inexistente");
        } else {
            System.out.println("Transferência não realizada.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
