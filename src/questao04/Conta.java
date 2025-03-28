package questao04;

public class Conta {

    double saldo = 0.00;
    double saldo02 = 0.00;

    public void consultarsaldo() {
        System.out.println("O saldo atual da primeira conta e: " + saldo);
        System.out.println("O saldo atual da segunda conta e: " + saldo02);
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Voce depositou: " + deposito);
        } else {
            System.out.println("Valor Invalido.");
        }
    }

    public void sacar(double saque) {
        if (saque > 0 && saque <= saldo) {
            saldo -= saque;
            System.out.println("Voce sacou: " + saque);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double transferencia) {
        if (transferencia > 0 && transferencia <= saldo) {
            saldo -= transferencia;
            saldo02 += transferencia;
            System.out.println("O valor da transferencia de: R$ " + transferencia + " foi executado com sucesso.");
        } else {
            System.out.println("Valor de transferencia invalido.");
        }
    }
}
