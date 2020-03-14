package aula02;

public class Trem extends Veiculo {

    String combustivel;

    int numeroDeRodas;

    Trem(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int numeroDeRodas){
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
        this.numeroDeRodas = numeroDeRodas;
    }

    public String toString() {
        return super.toString() + " | Combustível: " + this.combustivel + " | Numero de rodas: " + this.numeroDeRodas;
    }
}
