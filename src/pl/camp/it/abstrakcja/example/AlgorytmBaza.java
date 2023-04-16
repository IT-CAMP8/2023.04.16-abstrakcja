package pl.camp.it.abstrakcja.example;

public class AlgorytmBaza extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("wczytuje z bazy");
        this.setA(1);
        this.setB(3);
        this.setC(4);
    }

    @Override
    public void zapisz() {
        System.out.println("zapisuje do bazy");
    }
}
