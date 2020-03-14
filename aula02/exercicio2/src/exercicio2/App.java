package exercicio2;

public class App {

    public static void main(String[] args) {

        Livro oSenhorDosAneis = new Livro("O Senhor dos Anéis", "J.R.R Tolkien", Categoria.FANTASIA, Status.DISPONIVEL);
        System.out.println(oSenhorDosAneis.toString());

        Livro dracula = new Livro("Drácula", "Bram Stoker", Categoria.TERROR, Status.EMPRESTADO);
        System.out.println(dracula);

        Livro birdBox = new Livro("Bird Box", "Josh Malerman", Categoria.SUSPENSE, Status.EM_USO);
        System.out.println(birdBox);

        Livro umAmorParaRecordar = new Livro("Um amor para recordar", "Nicholas Sparks", Categoria.ROMANCE, Status.DISPONIVEL);
        System.out.println(umAmorParaRecordar);


    }
}
