public class Arcano extends Personagem {

    int mana;

    protected Arcano(final String nome, final double vida, final double ataque, final double defesa, final int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    void atacar(Personagem alvo, Magia magia) {

        double dano = calcularDano(alvo.defesa, magia.poderMagia);

        if (this.vida <= 0) {
            registrarAusenciaDeAtaque(alvo.nome);
        } else {
            if (this.mana <= 0) {
                System.out.println("Mana = " + this.mana + ", " + this.nome + " não pode atacar!");
            } else {
                if (alvo.defesa > (dano + alvo.defesa)) {    // dano + alvo.defesa = poderFinalDeAtaque
                    registrarDefesa(alvo.nome, magia.nomeMagia);
                } else {
                    alvo.vida -= dano;
                    this.mana -= magia.custoMana;
                    if (this.mana < 0) {
                        this.mana = 0;
                    }
                    if ((alvo.vida <= 0)) {
                        alvo.vida = 0;  // usei isto para não mostrar vida negativa no console
                        registrarMorte(alvo.nome, magia.nomeMagia);
                    } else {
                        registrarAtaque(alvo.nome, magia.nomeMagia, dano);
                    }
                }
            }
        }
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

}