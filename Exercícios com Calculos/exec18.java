import java.util.Scanner;

public class exec18 {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite a sua idade: ");
    int idade = leia.nextInt();

    System.out.println("Digite o ano atual: ");
    int anoAtual = leia.nextInt();

    int anoNascimento = anoAtual - idade;

    System.out.println("Você nasceu em " + anoNascimento);
  }
}
