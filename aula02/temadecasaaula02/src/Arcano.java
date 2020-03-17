public class Arcano extends Personagem {

    int mana;

    private Arcano(final String nome, final double vida, final double ataque, final double defesa, final int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    void atacar(Personagem alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderMagia);
        alvo.vida -= dano;
        mana -= magia.custoMana;
        registrar(alvo.nome, magia.nomeMagia, dano);
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

}