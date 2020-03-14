package aula02;

public class App {

    public static void main(String[] args) {

    Caminhao scania = new Caminhao("Scania", 140, "Solo", 4, "Diesel", 10);
    System.out.println(scania);

    Bicicleta minhaBike = new Bicicleta("Minha Bike", 100, "Solo", 1, 2);
    System.out.println(minhaBike);

    Navio titanic = new Navio("Titanic", 120, "Água", 3000, "Carvão");
    System.out.println(titanic);

    Submarino subRusso = new Submarino("Submarino Russo", 150, "Água", 15, "Energia Nuclear", 200 );
        System.out.println(subRusso);
    }

}
