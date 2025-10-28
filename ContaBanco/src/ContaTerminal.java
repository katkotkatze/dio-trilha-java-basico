import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        criarConta();

    }

    static void criarConta() {
        var scannerConta = new Scanner(System.in);
        System.out.println("Por favor,digite o seu Nome! (Exemplo: Mario Andrade)");
        var nomeCliente = scannerConta.nextLine();
        System.out.println("Por favor,digite o número da Agência! (Exemplo: 067-8)");
        var numeroAgencia = scannerConta.nextLine();
        System.out.println("Por favor,digite o número da Conta! (Exemplo: 1021)");
        var numeroConta = scannerConta.nextInt();

        double saldoConta = 237.48;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco" +
                ", sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nomeCliente,
                numeroAgencia,
                numeroConta, saldoConta);

        scannerConta.close();

    }
}
