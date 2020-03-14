package exercicio3;

public enum Segmento {

    ALIMENTAÇÃO("Alimentação"),
    LIMPEZA("Limpeza"),
    HIGIENE("Higiene");

    private String descricao;

    Segmento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
