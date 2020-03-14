package aula02;

public class Aviao extends Veiculo{

    String combustivel;

    double altitudeMaxima;

    Aviao(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, double altitudeMaxima) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.altitudeMaxima = altitudeMaxima;
    }

    public String toString() {
        return super.toString() + " | Combustível: " + this.combustivel + " | Altitude máxima: " + this.altitudeMaxima;
    }
}
