import java.util.*;
public class exec2
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        double raio, resu;

        System.out.println("Digite o raio do círculo: ");
        raio = leia.nextDouble();

        resu = (2*raio) * Math.PI;

        System.out.println("A areá do círculo é: " + resu);


        /* float raio = 2.4f;
        double comprimento = 2 * raio * Math.PI;
        System.out.println(comprimento); */
    }
}