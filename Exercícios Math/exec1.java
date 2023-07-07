import java.util.Scanner;

public class exec1
{
    public static void main(String[] args)
    {
       Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor x1: ");
        double x1 = leia.nextDouble();
        System.out.println("Digite o valor x2: ");
        double x2 = leia.nextDouble();
        System.out.println("Digite o valor y1: ");
        double y1 = leia.nextDouble();
        System.out.println("Digite o valor y2: ");
        double y2 = leia.nextDouble();

        double d = Math.sqrt(Math.pow(x1 - x2 , 2) + Math.pow(y1 - y2 , 2));

        System.out.println("A distancia entre eles é " + d);
    }
}