package questao04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta c = new Conta();

        while (true){
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Para verificar o saldo.");
            System.out.println("2 - Para depositar um valor.");
            System.out.println("3 - Para sacar um valor.");
            System.out.println("4 - Para transferir um valor.");
            System.out.println("5 - Para sair.");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                c.consultarsaldo();
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser depositado: ");
                double deposito = sc.nextDouble();
                c.depositar(deposito);
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser sacado: ");
                double saque = sc.nextDouble();
                c.sacar(saque);
            } else if (opcao == 4) {
                System.out.println("Digite o valor que deseja transferir: ");
                double transferir = sc.nextDouble();
                c.transferir(transferir);
            } else if (opcao == 5) {
                System.out.println("Saindo.");
                break;

            } else {
                System.out.println("Opcao invalida.");
            }
        }
    sc.close();
    }
}
