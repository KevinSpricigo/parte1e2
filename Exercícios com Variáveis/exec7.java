import java.util.Scanner;

public class exec7 {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i <= 0; i++){
            System.out.println("Digite seu nome: ");
            String nome = leia.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = leia.nextInt();
            System.out.println("Digite sua cidade: ");
            String cidade = leia.nextLine();

            System.out.println("Olá " + nome + ", você mora na cidade de " + cidade + " e tem " + idade + " anos!");

        }
    }
}