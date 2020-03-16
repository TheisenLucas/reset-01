package exercicio2;

public class Livro {

    String titulo;

    String autor;

    Categoria categoriaLivro;

    Status statusLivro;

    public Livro(String titulo, String autor, Categoria categoriaLivro, Status statusLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoriaLivro = categoriaLivro;
        this.statusLivro = statusLivro;
    }

    @Override
    public String toString() {
        return categoriaLivro.getDescricao() + " - " + titulo + " (" + autor + "): " + statusLivro.getDescricao();
    }
}
