public class Livro {
    String titulo;
    String autor;
    String status;

    public void registrarLivro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = "disponivel";
        System.out.println("Livro '" + titulo + "' de " + autor + " registrado com sucesso.");
    }

    public void emprestar() {
        this.status = "emprestado";
    }

    public void devolver() {
        this.status = "disponivel";
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Status: " + status);
    }
}