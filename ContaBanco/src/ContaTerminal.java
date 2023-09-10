import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
    
   	Scanner cliente = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Por favor digite o numero da conta");
    int Numero = cliente.nextInt();

    System.out.println("Por favor digite o numero da agencia" );
	String Agencia = cliente.next();
    
    System.out.println("Por favor, insira o nome do cliente");
    String nomeCliente = cliente.nextLine();
    cliente.nextLine(); // duplicando o nextLine - unico modo que consegui fazer pedir o nome completo do cliente

    System.out.println("digitar o saldo");
    double saldo = cliente.nextDouble();

    }
}
