import java.util.Scanner;
public class exec17
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = leia.nextDouble();
        System.out.println("Digite a quantidade de parcelas: ");
        int parc = leia.nextInt();

        double resu = valor / parc;

        System.out.println("O valor de cada parcela será de R$" + resu);
    }
}