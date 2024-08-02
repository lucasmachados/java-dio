import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            String nomeCliente;
            String sobrenome;
            int numero;
            String agencia;
            double saldo;
            
            System.out.println();
            System.out.println(" CONTA BANCÁRIA ");
		    System.out.println();
            System.out.println("Digite seu nome: ");
            nomeCliente = scanner.next();
            sobrenome = scanner.next();
            
            System.out.println("Por favor, digite o número da Agência: ");
            agencia = scanner.next();

            System.out.println("Digite sua conta: ");
            numero = scanner.nextInt();
            
            System.out.println("Digite seu saldo: ");
            saldo = scanner.nextDouble();

            System.out.println();
            System.out.println("Olá " + nomeCliente + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        }
    }
}
