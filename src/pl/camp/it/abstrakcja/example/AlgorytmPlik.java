package pl.camp.it.abstrakcja.example;

public class AlgorytmPlik extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("wczytuje z pliku");
    }

    @Override
    public void zapisz() {
        System.out.println("zapisuje do pliku");
    }
}
