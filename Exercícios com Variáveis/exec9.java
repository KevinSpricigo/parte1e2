import java.util.Scanner;

public class exec9 {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i <= 0; i++){
            System.out.println("Digite seu nome: ");
            String nome = leia.nextLine();
            System.out.println("Digite o nome da rua: ");
            String rua = leia.nextLine();
            System.out.println("Digite o nome da cidade: ");
            String estad = leia.nextLine();
            System.out.println("Digite o nome do estado: ");
            String estado = leia.nextLine();
            System.out.println("Digite o CEP: ");
            double cep = leia.nextDouble();
            System.out.println("Digite o CPF: ");
            double cpf = leia.nextDouble();
            System.out.println("Digite o número do celular: ");
            double celular = leia.nextDouble();
            System.out.println("Digite o número da rua: ");
            int nmrua = leia.nextInt();


            System.out.println("Nome .......: "+ nome);
            System.out.println("Endereço ...: RUA " + rua + ", NUMERO: " + nmrua + ", CEP: " + cep);
            System.out.println("Cidade......: " + estad);
            System.out.println("Estado......: " + estado);
            System.out.println("CPF.........: " + cpf);
            System.out.println("Tel. Celular: " + celular);

        }
    }
}