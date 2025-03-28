public class Usuario {
    String nome;
    int numeroId;

    public void registrarUsuario(String nome, int numeroId) {
        this.nome = nome;
        this.numeroId = numeroId;
        System.out.println("Usuario '" + nome + "' registrado com sucesso.");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", ID: " + numeroId);
    }
}