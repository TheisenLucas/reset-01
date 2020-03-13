package temadecasaaula01;

public class Guerreiros {

    String nome;

    int vida;

    int ataque;

    int defesa;

    int atacar (int poderArmaMagiaDivino, int ataqueAtacante, int defesaAlvo) { return (poderArmaMagiaDivino * ataqueAtacante) - defesaAlvo; }

    Guerreiros(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    boolean verificarVida() {
        return vida > 0;
    }
}
