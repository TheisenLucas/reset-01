public class AplicacaoComparador {

    public static void main(String[] args) {

        Comparador comparar = new Comparador();

        boolean resultado = comparar.menorQue(100, 20);
        System.out.println("O resultado da comparação é " + resultado);
    }
}
