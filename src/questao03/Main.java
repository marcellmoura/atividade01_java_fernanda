package questao03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        p.estoque = 10;

        System.out.println("A quantidade de " + p.nome + " em estoque são de: " + p.estoque);

        while (true) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Para adicionar ao estoque.");
            System.out.println("2- Para remover do estoque.");
            System.out.println("3 - Para sair.");
            int opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("Quantos produtos quer adicionar?");
                int adicionar = sc.nextInt();
                p.addEstoque(adicionar);
            } else if (opcao == 2) {
                System.out.println("Quantos produtos quer remover?");
                int remover = sc.nextInt();
                p.subEstoque(remover);
            } else if (opcao == 3) {
                System.out.println("Saindo.");
                break;
            } else {
                System.out.println("Opcao invalida");
            }

            System.out.println("A quantidade atual de " + p.nome + " em estoque é de: " + p.estoque);
        }

        sc.close();

    }
}
