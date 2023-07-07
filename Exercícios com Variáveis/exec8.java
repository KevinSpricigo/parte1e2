import java.util.Scanner;

public class exec8 {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i <= 0; i++){
            System.out.println("Digite um número INTEIRO: ");
            int nmr1 = leia.nextInt();
            System.out.println("Digite um número DECIMAL: ");
            double nmr2 = leia.nextDouble();

            System.out.println("O número inteiro fornecido foi " + nmr1 + " e o decimal foi o " + nmr2);
        }
    }
};