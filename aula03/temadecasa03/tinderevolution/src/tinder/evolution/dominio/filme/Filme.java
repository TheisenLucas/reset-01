package tinder.evolution.dominio.filme;

import tinder.evolution.dominio.filme.CategoriaFilme;

import java.time.LocalDate;

public class Filme {

//    Dados de um filme:
//    Id
//    Nome
//    Diretor
//    Data de Lançamento
//    Categoria
//    Sinopse

    private int id;

    private String nome;

    private String diretor;

    private LocalDate lancamento;

    private CategoriaFilme categoriaFilme;

    private String sinopse;

    public Filme(String nome, String diretor, LocalDate lancamento, CategoriaFilme categoriaFilme, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.categoriaFilme = categoriaFilme;
        this.sinopse = sinopse;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public CategoriaFilme getCategoriaFilme () {
        return categoriaFilme;
    }

    public void setCategoriaFilme(final CategoriaFilme categoriaFilme) {
        this.categoriaFilme = categoriaFilme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse (String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Filme> " +
                "Id: " + id +
                ", Nome: '" + nome + '\'' +
                ", Diretor: '" + diretor + '\'' +
                ", Data de lançamento: " + lancamento +
                ", Categoria: " + categoriaFilme +
                ", Sinopse: '" + sinopse + '\'' +
                '>';
    }
}
