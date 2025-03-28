package questao03;

public class Produto {
    String nome = "notebook";
    double preco = 3000.00;
    int estoque;

    public void addEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inserida invalida.");
        }
    }

    public void subEstoque(int quantidade) {
        if (quantidade > 0) {
            if (estoque >= quantidade) {
                estoque -= quantidade;
                System.out.println(quantidade + " unidades removidas do estoque.");
            } else {
                System.out.println("Estoque insuficiente para retirar.");
            }
        } else {
            System.out.println("Quantidade inserida inválida.");
        }
    }
}