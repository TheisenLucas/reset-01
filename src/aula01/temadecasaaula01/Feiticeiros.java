package temadecasaaula01;

public class Feiticeiros {

    String nome;

    int vida;

    int ataque;

    int defesa;

    int mana;

    int atacar (int poderArmaMagiaDivino, int ataqueAtacante, int defesaAlvo) { return (poderArmaMagiaDivino * ataqueAtacante) - defesaAlvo; }

    Feiticeiros(String nome, int vida, int ataque, int defesa, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    boolean verificarVida() {
        return vida > 0;
    }

    boolean verificarMana() {
        return mana > 0;
    }
}
