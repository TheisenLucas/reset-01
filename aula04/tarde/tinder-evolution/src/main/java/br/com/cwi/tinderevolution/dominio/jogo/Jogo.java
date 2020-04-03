package br.com.cwi.tinderevolution.dominio.jogo;

import java.time.LocalDate;

public class Jogo {

//    Dados de um jogo:
//        Id
//        Nome
//        Publisher
//        Data de Lançamento
//        Categoria
//        Plataforma

    private int id;

    private String nome;

    private String publisher;

    private LocalDate dataLancamento;

    private CategoriaJogo categoriaJogo;

    private PlataformaJogo plataformaJogo;

    public Jogo(String nome, String publisher, LocalDate dataLancamento, CategoriaJogo categoriaJogo, PlataformaJogo plataformaJogo) {
        this.nome = nome;
        this.publisher = publisher;
        this.dataLancamento = dataLancamento;
        this.categoriaJogo = categoriaJogo;
        this.plataformaJogo = plataformaJogo;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public CategoriaJogo getCategoriaJogo() {
        return categoriaJogo;
    }

    public void setCategoriaJogo(CategoriaJogo categoriaJogo) {
        this.categoriaJogo = categoriaJogo;
    }

    public PlataformaJogo getPlataformaJogo() {
        return plataformaJogo;
    }

    public void setPlataformaJogo(PlataformaJogo plataformaJogo) {
        this.plataformaJogo = plataformaJogo;
    }

    @Override
    public String toString() {
        return "Jogo>" +
                "Id: " + id +
                ", Nome: '" + nome + '\'' +
                ", Publisher: '" + publisher + '\'' +
                ", Data de Lançamento: " + dataLancamento +
                ", Categoria do Jogo: " + categoriaJogo +
                ", Plataforma do Jogo: " + plataformaJogo +
                '}';
    }
}
