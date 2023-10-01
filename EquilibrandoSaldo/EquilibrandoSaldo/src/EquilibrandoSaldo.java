import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" saldo atual é:  ");
        double saldoAtual = scanner.nextDouble();
        
        System.out.println("deposito: ");
        double valorDeposito = scanner.nextDouble();
        
        System.out.println("saque: ");
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
    
        saldoAtual = saldoAtual + valorDeposito;

        saldoAtual = saldoAtual - valorRetirada;
       System.out.println("Saldo atualizado na conta: " + saldoAtual);
     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    }
}