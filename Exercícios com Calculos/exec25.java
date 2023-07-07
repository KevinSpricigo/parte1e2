import java.util.Scanner;
public class exec25
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        double dolar = 4.79;
        for ( int i = 0; i <= 0; i++){
            System.out.println("Digite o valor em DOLAR: ");
            double dol = leia.nextDouble();

            double total = dol * dolar;

            System.out.println("A converção é de R$ " + total);
        }
    }
}