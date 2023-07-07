//F = C x 1,8 + 32.

import java.util.Scanner;
public class exec4
{
    public static void main(String[] args)
    {
        double celsius, faren;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite os graus celsius: ");
        celsius = leia.nextDouble();

        faren = (celsius * 1.8) + 32;

        System.out.println("A temperatura em farenheit é " + faren);

    }
}