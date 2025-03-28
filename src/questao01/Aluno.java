package questao01;

public class Aluno {
    String aluno;
    double nota01,nota02,nota03;
    double media;
    public double calcularMedia() {
        return (nota01 + nota02 + nota03) / 3;
    }
}
