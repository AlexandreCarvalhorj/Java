import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite sua Agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite a conta com o dígito:");
        String conta = scanner.next();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco,");
        System.out.println("Sua agência é " + agencia + ", sua conta é " + conta);
        System.out.println("e seu saldo de " + saldo + " já está disponível para saque!");
    }
}