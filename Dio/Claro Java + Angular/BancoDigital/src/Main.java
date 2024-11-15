import br.com.dio.banco.Cliente;
import br.com.dio.banco.Conta;
import br.com.dio.banco.ContaCorrente;
import br.com.dio.banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente Roberto = new Cliente("Roberto");
        Cliente Anatoly = new Cliente("Anatoly");

        Conta cc = new ContaCorrente(Roberto);
        Conta cp = new ContaPoupanca(Anatoly);

        cc.depositar(100);
        cc.imprimirExtrato();

        cc.transferir(50, cp);
        cp.imprimirExtrato();
        cc.imprimirExtrato();
        cp.transferir(20, cc);

    }
}