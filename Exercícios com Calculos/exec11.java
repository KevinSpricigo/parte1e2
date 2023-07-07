import java.util.Scanner;
public class exec11
{
    public static void main(String[] args)
    {
       Scanner leia = new Scanner(System.in);

       double valor1, valor2, valor3;

        System.out.println("Digite o valor: ");
        valor1 = leia.nextDouble();

        valor2 = valor1 * 0.15;
        valor3 = valor1 + valor2;

        System.out.println(valor1 + " com 15% de acréscimos virou " + valor3);
    }
}