package questao02;

public class Matematica {

    public static void opcao(int opcao, double numero1, double numero2) {

        switch (opcao) {
            case 1:
                System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("A subtração de " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                break;
            case 3:
                if (numero2 != 0) {
                    System.out.println("A divisão de " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                } else {
                    System.out.println("Divisão por zero não permitida.");
                }
                break;
            case 4:
                System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                break;
        }
    }
}