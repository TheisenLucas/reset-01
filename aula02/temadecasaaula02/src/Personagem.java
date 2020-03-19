public abstract class Personagem {

    String nome;

    double vida;

    double ataque;

    double defesa;

    public Personagem(final String nome, final double vida, final double ataque, final double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    double calcularDano(double defesa, double poderAtaque) {
        return ataque * poderAtaque - defesa;
    }

    void registrarAtaque(String alvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando " + dano + " de dano");
    }

    void registrarMorte(String alvo, String habilidade) {
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando a sua morte!");
    }

    void registrarDefesa(String alvo, String habilidade) {
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " e " + alvo + " defendeu o seu ataque");
    }

    void registrarAusenciaDeAtaque(String alvo){
        System.out.println(this.nome + " não pode atacar " + alvo + " pois está morto(a)! Personagens mortos não podem atacar");
    }
}
