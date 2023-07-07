import java.util.Scanner;

public class exec5
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da hipotenusa: ");
        double hip = leia.nextDouble();
        System.out.println("Digite o cateto oposto: ");
        double cato = leia.nextDouble();

        double adj = Math.sqrt(Math.pow(hip, 2) - Math.pow(cato, 2));

        System.out.println("O valor adjacente é: " + adj);
    }
}