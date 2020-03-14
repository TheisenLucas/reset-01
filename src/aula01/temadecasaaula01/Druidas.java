package temadecasaaula01;

public class Druidas {

    String nome;

    int vida;

    int ataque;

    int defesa;

    int fe;

    int atacar (int poderArmaMagiaDivino, int ataqueAtacante, int defesaAlvo) { return (poderArmaMagiaDivino * ataqueAtacante) - defesaAlvo; }

    Druidas(String nome, int vida, int ataque, int defesa, int fe) {
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
