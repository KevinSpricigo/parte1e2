import java.util.Scanner;

public class exec23
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double nmr = leia.nextDouble();
        System.out.println("Digite a potência: ");
        int potencia = leia.nextInt();

        double nmr1 = Math.sqrt(nmr);
        double nmr2 = Math.pow(nmr1, potencia);

        System.out.println("A raiz quadrada de " + nmr + " é " + nmr1 + " e a potência dessa raiz é " + nmr2);
    }
}