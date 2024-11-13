import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome_cliente;
        Double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Por favor, informe os quatro digitos da Conta !");
            numero = sc.nextInt();
        } while (String.valueOf(numero).length() != 4);
            sc.nextLine();

            System.out.println("Por favor, informe o Número da Agência (com o digito) !");
            agencia = sc.nextLine();

            System.out.println("Por favor, digite o Nome do CLiente !");
            nome_cliente = sc.nextLine();

        System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco, sua agência é [%s], conta [%d] e seu saldo de [%.2f] já está disponível para saque",
                nome_cliente.toUpperCase(), agencia, numero, saldo);
        sc.close();
    }
}