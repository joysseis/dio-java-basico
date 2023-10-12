import java.util.Scanner;

public class Condicionais {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    saldoTotal = saldoTotal - valorSaque;
    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    
        if (saldoTotal > 0){
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoTotal);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }
}