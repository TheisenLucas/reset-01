package br.com.cwi.aula04.dominio;

import java.time.LocalDate;

public class InformacaoProjeto {

    private int id;

    private String nome;

    private String descricao;

    private LocalDate lancamento;

    public InformacaoProjeto(String nome, String descricao, LocalDate lancamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.lancamento = lancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    @Override
    public String toString() {
        return "InformacaoProjeto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", lancamento=" + lancamento +
                '}';
    }
}
