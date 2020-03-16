package aula02;

public class App {

    public static void main(String[] args) {

        Caminhao scania = new Caminhao("Scania", 140, "Solo", 4, "Diesel", 10);
        System.out.println(scania);

        Bicicleta minhaBike = new Bicicleta("Minha Bike", 100, "Solo", 1, 2);
        System.out.println(minhaBike);

        Navio titanic = new Navio("Titanic", 120, "Água", 3000, "Carvão");
        System.out.println(titanic);

        Submarino subRusso = new Submarino("Submarino Russo", 150, "Água", 15, "Energia Nuclear", 200);
        System.out.println(subRusso);

        Carro ferrari = new Carro("Ferrari", 340, "Solo", 2, "Gasolina", 4);
        System.out.println(ferrari);

        Aviao boeing = new Aviao("Boeing", 400, "Ar", 400, "Gasolina de Avião", 3000);
        System.out.println(boeing);

        Trem mariaFumaça = new Trem("Maria Fumaça", 120, "Solo", 400, "Carvão", 8);
        System.out.println(mariaFumaça);
    }

}
