package aula02;

public class Submarino extends Veiculo {

    String combustivel;

    double profundidadeMaxima;

    Submarino(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, double profundidadeMaxima) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
        this.profundidadeMaxima = profundidadeMaxima;
    }

    /*@Override
    public String toString() {
        return "Submarino{" +
                "combustivel='" + combustivel + '\'' +
                ", profundidadeMaxima=" + profundidadeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    } */

    public String toString() {
        return super.toString() + " | Combustível: " + this.combustivel + " | Profundidade máxima: " + this.profundidadeMaxima;
    }
}
