package br.com.cwi.tinderevolution.dominio.jogo;

public enum PlataformaJogo {

    PC("Pc"),
    PS4("Ps4"),
    SNES("Snes"),
    XBOX("Xbox");

    private String descricao;

    PlataformaJogo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
