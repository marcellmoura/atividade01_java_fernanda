package questao02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("Digite 1 para soma, 2 para subtração, 3 para divisão e 4 para multiplicação: ");
        int opcao = sc.nextInt();

        Matematica.opcao(opcao, numero1, numero2);

        sc.close();
    }
}