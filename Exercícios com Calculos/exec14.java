import java.util.Scanner;

public class exec14
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double valor1 = leia.nextDouble();

        double valor2 = Math.pow(valor1, 3);

        System.out.println("O valor " + valor1 + " elevado ao cubo é " + valor2);
    }
}