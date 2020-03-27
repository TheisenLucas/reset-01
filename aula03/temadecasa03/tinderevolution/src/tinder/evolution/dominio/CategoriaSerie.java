package tinder.evolution.dominio;

public enum CategoriaSerie {

    ACAO("Ação"),
    COMEDIA("Comédia"),
    DRAMA("Drama"),
    SITCOM("Sitcom"),
    SUSPENSE("Suspense"),
    TERROR("Terror");

    private String descricao;

    CategoriaSerie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
