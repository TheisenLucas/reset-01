package temadecasaaula01;

public class Atacar {

    String nomeAtacante;

    String nomeAlvo;

    int poderFinalAtaque (int poderArmaMagiaDivino, int ataqueAtacante) { return poderArmaMagiaDivino * ataqueAtacante; }

    int dano (int poderFinalAtaque, int defesaAlvo) { return poderFinalAtaque - defesaAlvo; }

    Atacar(String nomeAtacante, String nomeAlvo, int ) {
        this.nomeAtacante = nomeAtacante;
        this.nomeAlvo = nomeAlvo;
    }
}
