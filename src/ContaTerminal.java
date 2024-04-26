import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Integer numero = null;
        String agencia = null;
        String nomeCliente = null;
        Double saldo = null;

        System.out.println("--------- CONTA BANCÁRIA ---------");
        System.out.print("Por favor, preencha os campos solicitados abaixo");
        System.out.println("para proseguir com o processo");

        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Digite o número da Agência: ");
        agencia = scanner.next();

        System.out.print("Digite o  saldo: ");
        saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }    
}
