
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int Numero;
        String Agencia;
        String NomeDoCliente;
        double Saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta: ");
        Numero = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agencia: ");
        Agencia = scanner.next();
        
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente: ");
        NomeDoCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        Saldo = scanner.nextDouble();

        System.out.println("Olá "+ NomeDoCliente + " , o seu saldo é de R$ " + Saldo + " na conta de número " + Numero + " referente a agência " + Agencia + ".");

    }
}
