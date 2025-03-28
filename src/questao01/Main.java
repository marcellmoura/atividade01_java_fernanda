package questao01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome completo: ");
        a.aluno = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        a.nota01 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        a.nota02 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        a.nota03 = sc.nextDouble();

        if(a.calcularMedia() >= 7.0) {
            System.out.println(a.aluno + ", Você esta aprovado com a média: " + String.format("%.2f", a.calcularMedia()));
        } else if (a.calcularMedia() > 4 &&  a.calcularMedia() <= 6.9) {
            System.out.println("Você esta na final com a média:"  + a.calcularMedia());
        } else {
            System.out.println("Você esta reprovado com a média:"  + a.calcularMedia());
        }

        sc.close();



    }
}