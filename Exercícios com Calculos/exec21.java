import java.util.Scanner;
public class exec21
{
    public static void main(String[] args) 
    {

                Scanner leia = new Scanner(System.in);

                System.out.println("Digite sua altura em metros: ");
                double alt = leia.nextDouble();
                System.out.println("Digite seu peso em kilogramas: ");
                double kilo = leia.nextDouble();

                double imc = kilo / Math.pow(alt, 2);

                System.out.println("Seu IMC ideal é de " + imc);
            }
        }
