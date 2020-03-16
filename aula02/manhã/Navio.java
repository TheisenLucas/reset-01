package aula02;

public class Navio extends Veiculo {

    String combustivel;

    Navio(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
    }

    public String toString() {
        return super.toString() + " | Combustível: " + this.combustivel;
    }

}