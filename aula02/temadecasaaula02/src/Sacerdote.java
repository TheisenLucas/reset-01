public class Sacerdote extends Personagem{

    int fe;

    public Sacerdote(final String nome, final double vida, final double ataque, final double defesa, final int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.intesidadePoderDivino);
        alvo.vida -= dano;
        registrar(alvo.nome, poderDivino.nomePoderDivino, dano);
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }

}
