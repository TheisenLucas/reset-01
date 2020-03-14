package aula02;

public class Bicicleta extends Veiculo {

    int numeroDeRodas;

    Bicicleta(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, int numeroDeRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.numeroDeRodas = numeroDeRodas;
    }

    public String toString() {
        return super.toString() + " | Numero de rodas: " + this.numeroDeRodas;
    }
}