package br.com.cwi.tinderevolution.dominio.esporte;

public class Esporte {

    private int id;

    private String nome;

    public Esporte() {} // Usado de desserialização, sem ele não consigo usar REST para criar

    public Esporte(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Esporte>" +
                "Id: " + id +
                ", Nome: '" + nome + '\'' +
                '}';
    }
}
