import java.util.Scanner;

public class exec10 {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i <= 0; i++){
            System.out.println("Digite a quantidade de dias que o carro foi alugado: ");
            double dias = leia.nextDouble();
            System.out.println("Digite o preço da diária: ");
            double dia = leia.nextDouble();

            double total = dias * dia;

            System.out.println("O valor total foi de R$ " + total);
        }
    }
}