import java.util.Scanner;

public class exec13 {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i <= 0; i++){
            System.out.println("Digite o valor do produto: ");
            double vlr = leia.nextDouble();
            System.out.println("Digite a quantidade comprada: ");
            double qtd = leia.nextDouble();

            double total = vlr * qtd;

            System.out.println("O valor total foi de R$ " + total);
        }
    }
}