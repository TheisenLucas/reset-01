package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", Segmento.ALIMENTAÇÃO, 3.25, 3);
        Produto produto2 = new Produto("Feijão", Segmento.ALIMENTAÇÃO, 2.75, 2);
        Produto produto3 = new Produto("Chocolate", Segmento.ALIMENTAÇÃO, 4.99, 4);
        Produto produto4 = new Produto("Sabão em pó", Segmento.LIMPEZA, 11.99, 1);
        Produto produto5 = new Produto("Sabonete", Segmento.HIGIENE, 1.65, 8);

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);

        produto1.toString();

    }

}
