import java.util.Scanner;

public class exec9 {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i <= 0; i++){
            System.out.println("Digite a quantidade de litros: ");
            double litros = leia.nextDouble();
            System.out.println("Digite o preço da gasolina: ");
            double prç = leia.nextDouble();

            double total = litros * prç;

            System.out.println("O valor total foi de R$ " + total);
        }
    }
}