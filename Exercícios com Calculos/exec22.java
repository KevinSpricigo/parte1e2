import java.util.Scanner;

public class exec22
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        
        int nmr1, nmr2, maior, menor;

        System.out.println("Digite um numero: ");
        nmr1 = leia.nextInt();
        System.out.println("Digite outro número: ");
        nmr2 = leia.nextInt();

        maior = Math.max(nmr1, nmr2);
        menor = Math.min(nmr1, nmr2);

        System.out.println("O maior número é " + maior + " e o menor é " + menor);
    }
}