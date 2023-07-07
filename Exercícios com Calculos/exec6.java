import java.util.Scanner;
public class exec6
{
    public static void main(String[] args)
    {
       double dia, hora, minuto, segundo, resu;
        Scanner leia = new Scanner(System.in);

        System.out.println("Número de dias:");
        dia = leia.nextDouble();
        System.out.println("Número de horas:");
        hora = leia.nextDouble();
        System.out.println("Número de minutos:");
        minuto = leia.nextDouble();
        System.out.println("Número de segundos:");
        segundo = leia.nextDouble();

        resu = dia * 24 * 3600 + hora * 3600 + minuto * 60 + segundo;

        System.out.println("o valor é: " + resu);
    }
}