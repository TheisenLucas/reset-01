public class HomemDeArmas extends Personagem {

    protected HomemDeArmas(final String nome, final double vida, final double ataque, final double defesa) {
        super(nome, vida, ataque, defesa);
    }

    void atacar(Personagem alvo, Arma arma) {

        double dano = calcularDano(alvo.defesa, arma.poderAtaqueArma);

        if (this.vida <= 0) {
            registrarAusenciaDeAtaque(alvo.nome);
        } else {
            if (alvo.defesa > (dano + alvo.defesa)) {    // dano + alvo.defesa = poderFinalDeAtaque
                registrarDefesa(alvo.nome, arma.nomeArma);
            } else {
                alvo.vida -= dano;
                if ((alvo.vida <= 0)) {
                    alvo.vida = 0;  // usei isto para não mostrar vida negativa no console
                    registrarMorte(alvo.nome, arma.nomeArma);
                } else {
                    registrarAtaque(alvo.nome, arma.nomeArma, dano);
                }
            }
        }
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }
}