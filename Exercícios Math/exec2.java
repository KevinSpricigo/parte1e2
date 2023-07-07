import java.util.Scanner;

public class exec2
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        System.out.println("Arrodondar para cima e para baixo\n");
        System.out.println("Digite um número: ");
        double nmr1 = leia.nextDouble();

        double nmr1ceil = Math.ceil(nmr1);
        double nmr1floor = Math.floor(nmr1);

        System.out.println("A) Arredondado para cima " + nmr1ceil);
        System.out.println("B) Arredondado para baixo " + nmr1floor + " \n\n");

        System.out.println("************************\n\n");

        System.out.println("Número aleatorio entre 0 e 1\n");
        double alea = Math.random();

        System.out.println("C) Um número aleatorio 0/1 ||| " + alea + "\n\n");

        System.out.println("*******************************\n\n");

        System.out.println("Valor absoluto\n");
        System.out.println("Digite um numero: ");
        double n = leia.nextDouble();

        double n1 = Math.abs(n);

        System.out.println("D) O valor absoluto de " + n + " é " + n1 + "\n\n");

        System.out.println("*******************************\n\n");

        System.out.println("Numero maximo e minimo\n");
        System.out.println("Digite o primeiro numero: ");
        int naa = leia.nextInt();
        System.out.println("Digite o segundo numero: ");
        int naaa = leia.nextInt();

        double na = Math.max(naa, naaa);
        double ma = Math.min(naa, naaa);

        System.out.println("E) O valor máximo é " + na);
        System.out.println("F) O valor mínimo é " + ma + "\n\n");

        System.out.println("*******************************\n\n");

        System.out.println("Calcular angulo em radianos\n");

        System.out.println("Digite um ângulo: ");
        double seno = leia.nextDouble();

        double senoo = Math.sin(seno);
        double cosse = Math.cos(seno);

        System.out.println("G) O seno do angulo " + seno + " é " + senoo);
        System.out.println("H) O cosseno do angulo " + seno + " é " + cosse);

    }
}