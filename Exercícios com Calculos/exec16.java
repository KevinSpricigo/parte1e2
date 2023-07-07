import java.util.Scanner;

public class exec16
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = leia.nextDouble();
        System.out.println("Digite a porcentagem de desconto(Só o número): ");
        double porc = leia.nextDouble();

        double porc1 = porc / 100;  // tranforma em 0,1
        double valor1 = (valor * porc1) ;
        valor1 = valor - valor1;

        System.out.println("O valor " + valor + " com " + porc + "% de desconto fica no total de " + valor1);
    }
}