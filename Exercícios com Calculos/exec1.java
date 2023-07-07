import java.util.Scanner;

public class exec1 {
    public static void main(String[] args)
    {
       Scanner leia = new Scanner(System.in);

       for (int i = 1; i <= 1; i++) {
           System.out.println("Digite dois números: ");
           int nm1 = leia.nextInt();
           int nm2 = leia.nextInt();
           int nm3 = nm1 + nm2;
           System.out.println("A soma dos dois números é " + nm3);
       }
    }
}