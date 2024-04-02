package Java;

public class Livro {
    private String titulo = "Naruto";
    private String autor = "Masashi Kishimoto";
    private int anoPublicacao = 1999;
    private int copiasDisponiveis = 0;

    public void emprestarCopia() {
        if (existeCopia()) {
            System.out.println("Livro emprestado com sucesso!");
            this.copiasDisponiveis--;
        } else {
            System.out.println("Não há cópias desse livro.");
        }
    }

    public void devolverCopia() {
        System.out.println("Livro devolvido com sucesso!");
        this.copiasDisponiveis++;
    }

    public boolean existeCopia() {
        if (this.copiasDisponiveis > 0) {
            return true;
        }
        return false;
    }

    public void informacoesLivro() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
        System.out.println("Cópias disponíveis: " + this.copiasDisponiveis);
    }

    public void main(String[] args) {
        informacoesLivro();
    }
}