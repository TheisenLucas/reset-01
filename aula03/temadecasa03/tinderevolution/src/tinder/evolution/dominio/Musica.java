package tinder.evolution.dominio;

import java.time.LocalDate;

public class Musica {

    private int id;

    private String nome;

    private String artista;

    private LocalDate lancamento;

    private EstiloMusical estiloMusical;

    public Musica(String nome, String artista, LocalDate lancamento, EstiloMusical estiloMusical) {
        this.nome = nome;
        this.artista = artista;
        this.lancamento = lancamento;
        this.estiloMusical = estiloMusical;
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public EstiloMusical getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(final EstiloMusical estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", estiloMusical=" + estiloMusical +
                ", lancamento=" + lancamento +
                '}';
    }
}
