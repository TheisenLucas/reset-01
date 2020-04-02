package br.com.cwi.tinderevolution.dominio.usuario;

import java.time.LocalDate;

public class Usuario {
    //  Dados de Usuário:
//  Id
//  Nome
//  Email
//  Telefone
//  Data de Nascimento
//  Bio
//  Localização:
//    Latitude
//    Longitude
    private int id;

    private String nome;

    private String email;

    private String telefone;

    private LocalDate dataNascimento;

    private String biografia;

    private Double latitude;

    private Double longitude;

    public Usuario(String nome, String email, String telefone, LocalDate dataNascimento, String biografia, Double latitude, Double longitude) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Dados do Usuario>" +
                "id=" + id +
                ", Nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                ", Telefone='" + telefone + '\'' +
                ", Data de Nascimento=" + dataNascimento +
                ", Biografia='" + biografia + '\'' +
                ", Latitude=" + latitude +
                ", Longitude=" + longitude +
                '>';
    }
}
