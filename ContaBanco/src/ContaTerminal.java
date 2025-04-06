import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite seu número: ");
        numeroConta = entrada.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = entrada.next();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = entrada.next();

        System.out.println("Por favor, digite seu saldo: ");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo
                + " já está disponível para saque.");

        entrada.close();
    }
}
