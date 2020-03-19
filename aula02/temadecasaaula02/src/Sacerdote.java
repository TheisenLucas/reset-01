public class Sacerdote extends Personagem {

    int fe;

    protected Sacerdote(final String nome, final double vida, final double ataque, final double defesa, final int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) {

        double dano = calcularDano(alvo.defesa, poderDivino.intesidadePoderDivino);

        if (this.vida <= 0) {
            registrarAusenciaDeAtaque(alvo.nome);
        } else {
            if (alvo.defesa > (dano + alvo.defesa)) {    // dano + alvo.defesa = poderFinalDeAtaque
                registrarDefesa(alvo.nome, poderDivino.nomePoderDivino);
            } else {
                alvo.vida -= dano;
                this.fe -= poderDivino.custoFe;
                if ((alvo.vida <= 0)) {
                    alvo.vida = 0;  // usei isto para não mostrar vida negativa no console
                    registrarMorte(alvo.nome, poderDivino.nomePoderDivino);
                } else {
                    registrarAtaque(alvo.nome, poderDivino.nomePoderDivino, dano);
                }
            }
        }
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }
}
