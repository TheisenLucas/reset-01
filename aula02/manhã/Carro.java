package aula02;

import com.sun.org.glassfish.external.statistics.impl.AverageRangeStatisticImpl;

public class Carro extends Veiculo {

    String combustivel;

    int numeroDeRodas;

    Carro(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int numeroDeRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
        this.numeroDeRodas = numeroDeRodas;
    }

    public String toString() {
        return super.toString() + " | Combustível: " + this.combustivel + " | Numero de rodas: " + this.numeroDeRodas;
    }

}
