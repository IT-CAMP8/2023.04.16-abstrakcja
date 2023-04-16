package pl.camp.it.abstrakcja;

public class App {
    public static void main(String[] args) {
        SimpleInterface database = new BazaDanych();
        database.zapisz();

        database.odczytaj();


        database.usun(198);

        database.odczytaj();

        database.metoda();

        AbstractClass abstractClass = new KlasaNieabstrakcyjna(5);
    }
}
