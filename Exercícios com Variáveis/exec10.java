import java.util.Scanner;

public class exec10
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        int nmr1 = leia.nextInt();
        System.out.println("Digite o número 2: ");
        int nmr2 = leia.nextInt();

        int nmr3 = nmr1;
        int nmr1a = nmr2;
        int nmr2a = nmr3;

        System.out.println("O número 1 ficou " + nmr1a + " e o numero 2 ficou " + nmr2a);

    }
}