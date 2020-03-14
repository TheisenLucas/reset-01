package aula02;

public class Veiculo {

    String nome;

    double velocidadeMaxima;

    String terreno;

    int lotacaoMaxima;

    Veiculo(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.terreno = terreno;
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public String toString() {
        return "Veículo: " + this.nome;
    }

}
