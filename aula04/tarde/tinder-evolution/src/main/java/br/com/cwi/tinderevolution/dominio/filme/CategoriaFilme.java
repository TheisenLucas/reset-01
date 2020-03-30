package br.com.cwi.tinderevolution.dominio.filme;

public enum CategoriaFilme {

    ACAO("Ação"),
    COMEDIA("Comédia"),
    DRAMA("Drama"),
    MUSICAL("Musical"),
    SUSPENSE("Suspense"),
    TERROR("Terror");

    private String descricao;

    CategoriaFilme(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
