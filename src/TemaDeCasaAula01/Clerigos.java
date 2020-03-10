package TemaDeCasaAula01;

public class Clerigos {

    String nome;

    int vida;

    int ataque;

    int defesa;

    int fe;

    Clerigos(String nome, int vida, int ataque, int defesa, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }

    boolean verificarVida() {
        return vida > 0;
    }

    boolean verificarFe() {
        return fe > 0;
    }
}
