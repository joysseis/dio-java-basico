import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < String > ();

    //Entrada dos tipos de ativos
    System.out.print("?: ");
    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine();

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      //scanner.nextLine();
      System.out.print("add: ");
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);

    }
    Collections.sort(ativos);
    //TODO: Ordenar os ativos em ordem alfabética.

    for(String ativo : ativos){

        System.out.println(ativo);
        
        }
    //System.out.println(ativos);
    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
  }
}