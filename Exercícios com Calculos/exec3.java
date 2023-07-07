import java.util.Scanner;
public class exec3
{
    public static void main(String[] args)
    {
        double base, altura, area;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo ");
        altura = leia.nextDouble();
        System.out.println("Digite a base do triângulo ");
        base = leia.nextDouble();

        area = (altura + base) / 2;

        System.out.println("A área do triângulo é: " + area);

    }
}