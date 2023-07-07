import java.util.Scanner;
public class exec8
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = leia.nextDouble();

        double vlrdes = valor * 0.1;
        double vf = valor - vlrdes;

        System.out.println(valor + " com 10% de desconto é " + vf);
    }
}