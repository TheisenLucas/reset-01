package tinder.evolution.dominio;

import java.time.LocalDate;

public class Serie {

//    Dados de uma série:
//    Id
//    Nome
//    Diretor
//    Data de Lançamento
//    Número de temporadas
//    Número de episódios
//    Categoria
//    Sinopse

    private int id;

    private String nome;

    private String diretor;

    private LocalDate lancamento;

    private int numeroTemporadas;

    private int numeroEpisodios;

    private CategoriaSerie categoriaSerie;

    private String sinopse;

    public Serie(String nome, String diretor, LocalDate lancamento, int numeroTemporadas, int numeroEpisodios, CategoriaSerie categoriaSerie, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodios = numeroEpisodios;
        this.categoriaSerie = categoriaSerie;
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

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public CategoriaSerie getCategoriaSerie() {
        return categoriaSerie;
    }

    public void setCategoriaSerie(final CategoriaSerie categoriaSerie) {
        this.categoriaSerie = categoriaSerie;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Serie> " +
                "Id: " + id +
                ", Nome: '" + nome + '\'' +
                ", Diretor: '" + diretor + '\'' +
                ", Número de temporadas: '" + numeroTemporadas + '\'' +
                ", Número de episódios: '" + numeroEpisodios + '\'' +
                ", Data de lançamento: " + lancamento +
                ", Categoria: " + categoriaSerie +
                ", Sinopse: '" + sinopse + '\'' +
                '}';
    }
}
