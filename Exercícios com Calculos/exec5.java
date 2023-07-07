import java.util.Scanner;
public class exec5
{
    public static void main(String[] args)
    {
        double hora, valor, resu;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite as suas horas de trabalho no dia: ");
        hora = leia.nextDouble();
        System.out.println("Digite o valor ganhado por hora: ");
        valor = leia.nextDouble();

        resu = hora * valor;

        System.out.println("O salario ganhado no dia foi: " + resu);
    }
}