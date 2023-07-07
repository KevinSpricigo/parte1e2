import java.util.Scanner;

public class exec12 {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double prd = leia.nextDouble();

        double prd2 = prd + (prd * 0.15);

        System.out.println("O valor com o acrescimo foi de R$ " + prd2);
    }
}