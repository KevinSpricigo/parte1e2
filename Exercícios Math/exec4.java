import java.sql.SQLOutput;
import java.util.Scanner;

public class exec4
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = leia.nextDouble();

        double raio2 = Math.PI * Math.pow(raio, 2);

        System.out.println("A) o area é de: " + raio2);

        double circ = 2 * Math.PI * raio2;

        System.out.println("B) A circunferencia do raio é de: " + circ + "\n\n");

        System.out.println("*******************************\n\n");

        System.out.println("Digite o cateto adjacente: ");
        double cata = leia.nextDouble();
        System.out.println("Digite o cateto oposto: ");
        double cato = leia.nextDouble();

        double hip = Math.sqrt(Math.pow(cata, 2) - Math.pow(cato, 2));

        System.out.println("C) O valor da hipotenusa é de: " + hip + "\n\n");

        System.out.println("********************************\n\n");

        System.out.println("Digite o cumprimento: ");
        double cump = leia.nextDouble();
        System.out.println("Digite a altura: ");
        double alt = leia.nextDouble();

        double circun = Math.pow(cump,2) + Math.pow(alt, 2);

        System.out.println("D) A circunferencia do retângulo é de " + circun + "\n\n");

        System.out.println("*******************************\n\n");

        System.out.println("Digite a base: ");
        double base = leia.nextDouble();
        System.out.println("Digite a altura: ");
        double altuT = leia.nextDouble();

        double area = (base + altuT) / 2;

        System.out.println("A area do tringulo é: " + area);

    }
}