package tinder.evolution.usuario;

public class DadosUsuario {
//
//    Id
//  - Nome
//  - Email
//  - Telefone
//  - Data de Nascimento
//  - Bio
//  - Localização:
//    - Latitude
//    - Longitude
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;
    private String biografia;
    private String localizacao;

    public DadosUsuario(String nome, String email, String telefone, String dataNascimento, String biografia, String localizacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
        this.localizacao = localizacao;
    }


}
