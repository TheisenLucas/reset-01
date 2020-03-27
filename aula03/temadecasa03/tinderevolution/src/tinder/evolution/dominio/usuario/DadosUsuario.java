package tinder.evolution.dominio.usuario;

import java.time.LocalDate;

public class DadosUsuario {
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

    private double localizacao;

    public DadosUsuario(String nome, String email, String telefone, LocalDate dataNascimento, String biografia, double localizacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
        this.localizacao = localizacao;
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

    public double getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(double localizacao) {
        this.localizacao = localizacao;
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
                ", Localizacao=" + localizacao +
                '>';
    }
}
