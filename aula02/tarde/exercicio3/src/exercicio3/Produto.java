package exercicio3;

public class Produto {

    String nome;

    Segmento segmento;

    double valor;

    int quantidade;

    double valorTotal() {
        return valor * quantidade;
    }

    public Produto(String nome, Segmento segmento, double valor, int quantidade) {
        this.nome = nome;
        this.segmento = segmento;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    void imprimeLista (){
        System.out.println("[" + segmento.getDescricao() + "]" + " - " + nome + "(" + quantidade + ")" + " | " + valorTotal());
    }
}
