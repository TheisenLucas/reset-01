package br.com.cwi.tinderevolution.dominio.curiosidade;

public enum CategoriaCuriosidade {

    ALIMENTACAO("Alimentação"),
    APARENCIA("Aparência"),
    COMPORTAMENTO("Comportamento"),
    EVENTO("Evento");

    private String descricao;

    CategoriaCuriosidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
