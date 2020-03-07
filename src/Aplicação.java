public class Aplicação {

    public static void main(String[] args) {    //através desta sintaxe o programa começa a ler o código

        Calculadora calculadoraDeIdade = new Calculadora();   //calculadoraDeIdade é um objeto calculadora

        int somaDasIdades = calculadoraDeIdade.somar(33, 54);  //somaDasIdades é uma variável que recebe objeto calculadoraDeIdade no método somar
        System.out.println("O resultado da soma é " + somaDasIdades);

        int subtracaoDasIdades = calculadoraDeIdade.subtrair(33, 54);
        System.out.println("O resultado da subtração é " + subtracaoDasIdades);

        int multiplicacaoDasIdades = calculadoraDeIdade.multiplicar(33, 54);
        System.out.println("O resultado da multiplicação é " + multiplicacaoDasIdades);

        double divisaoDasIdades = calculadoraDeIdade.dividir(33, 54);
        System.out.println("O resultado da divisão é " + divisaoDasIdades);
    }

}