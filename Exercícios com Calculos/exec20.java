import java.util.Scanner;
public class exec20
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um lado de um quadrado: ");
        double qdr = leia.nextDouble();

        qdr = Math.pow( qdr, 2);

        System.out.println(qdr + " é a área do quadrado!");
    }
}