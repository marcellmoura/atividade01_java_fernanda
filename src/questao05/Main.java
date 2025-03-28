import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();
        Usuario usuario = new Usuario();

        while (true) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Registrar um novo livro.");
            System.out.println("2 - Registrar um novo usuario.");
            System.out.println("3 - Realizar emprestimo de um livro.");
            System.out.println("4 - Devolver um livro.");
            System.out.println("5 - Exibir a lista de livros emprestados.");
            System.out.println("6 - Sair.");

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o titulo do livro:");
                String titulo = sc.nextLine();
                System.out.println("Digite o autor do livro:");
                String autor = sc.nextLine();
                livro.registrarLivro(titulo, autor);

            } else if (opcao == 2) {
                System.out.println("Digite o nome do usuario:");
                String nome = sc.nextLine();
                System.out.println("Digite o numero de identificacao do usuario:");
                int numeroId = sc.nextInt();
                usuario.registrarUsuario(nome, numeroId);

            } else if (opcao == 3) {
                System.out.println("Digite o numero de identificacao do usuario:");
                int numeroId = sc.nextInt();
                sc.nextLine(); // Limpar o buffer de linha
                System.out.println("Digite o titulo do livro a ser emprestado:");
                String titulo = sc.nextLine();
                if (livro.status.equals("disponivel")) {
                    livro.emprestar();
                    System.out.println("Livro '" + titulo + "' emprestado para " + usuario.nome + ".");
                } else {
                    System.out.println("O livro '" + titulo + "' ja esta emprestado.");
                }

            } else if (opcao == 4) {
                System.out.println("Digite o titulo do livro a ser devolvido:");
                String titulo = sc.nextLine();
                if (livro.status.equals("emprestado")) {
                    livro.devolver();
                    System.out.println("Livro '" + titulo + "' devolvido com sucesso.");
                } else {
                    System.out.println("Livro nao encontrado ou nao foi emprestado.");
                }

            } else if (opcao == 5) {
                if (livro.status.equals("emprestado")) {
                    livro.exibirInfo();
                } else {
                    System.out.println("Nao ha livros emprestados no momento.");
                }

            } else if (opcao == 6) {
                System.out.println("Saindo.");
                break;

            } else {
                System.out.println("Opcao invalida.");
            }
        }

        sc.close();
    }
}