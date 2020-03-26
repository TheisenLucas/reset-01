package tinder.evolution.dominio;

public enum EstiloMusical {

    FUNK("Funk"),
    INDIE("Indie"),
    METAL("Metal"),
    PAGODE("Pagode"),
    ROCK("Rock"),
    SERTANEJO("Sertanejo");


    private String descricao;

    EstiloMusical(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
