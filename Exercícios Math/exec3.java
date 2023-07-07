import java.util.Scanner;
public class exec3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = leia.nextDouble();
        double tan = Math.tan(valor);
        double rad = Math.toRadians(tan);
        System.out.println("A tangente em radianos deste angulo é " +rad);

        double arcose = Math.asin(valor);
        double arcoco = Math.acos(valor);
        double arcotg = Math.atan(valor);
        double log = Math.log(valor);

        System.out.println("O valor do arco seno é "+arcose);
        System.out.println("O valor do arco cosseno é "+arcoco);
        System.out.println("O valor do arco da tangente é "+arcotg);
        System.out.println("O valor do logaritmo natural é "+log);
    }
}
