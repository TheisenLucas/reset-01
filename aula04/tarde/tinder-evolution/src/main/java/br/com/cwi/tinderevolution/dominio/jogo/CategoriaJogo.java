package br.com.cwi.tinderevolution.dominio.jogo;

public enum CategoriaJogo {

    ACAO("Ação"),
    COMEDIA("Comédia"),
    DRAMA("Drama"),
    MUSICAL("Musical"),
    SUSPENSE("Suspense"),
    TERROR("Terror");

    private String descricao;

    CategoriaJogo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
