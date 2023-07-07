import java.util.Scanner;

public class exec15
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        double altura;
        double peso;
        double imc;

        System.out.println("Digite sua altura(EM METROS): ");
        altura = leia.nextDouble();
        System.out.println("Digite seu peso(EM QUILOGRAMAS): ");
        peso = leia.nextDouble();

        imc = peso / Math.pow(altura, 2) ;

        System.out.println("Seu imc é de: " + imc);

    }
}