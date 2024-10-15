import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.print("Por favor, digite o número de sua conta: ");
        int numero = sc.nextInt();

        System.out.print("Sua agência: ");
        String agencia = sc.next();


        System.out.print("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.print("Seu saldo por favor: ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "Conta " + numero + " e seu saldo já está disponível para saque.");
    }
}
