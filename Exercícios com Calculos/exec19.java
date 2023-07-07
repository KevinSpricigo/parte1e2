import java.util.Scanner;
public class exec19
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();

        System.out.println("Digite seus meses: ");
        int meses = leia.nextInt();

        int resu = idade * 365 + meses * 30;

        System.out.println("O número aproximado de dias que você viveu é de " + resu + " dias!");
    }
}