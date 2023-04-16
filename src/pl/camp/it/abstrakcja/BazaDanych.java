package pl.camp.it.abstrakcja;

public class BazaDanych implements SimpleInterface, SimpleInterface2 {
    @Override
    public void zapisz() {
        System.out.println("zapisuje !!!");
    }

    @Override
    public void odczytaj() {
        System.out.println("odczytuje !!!");
    }

    @Override
    public void usun(int id) {
        System.out.println("usuwam !!!");
    }

    @Override
    public void metoda() {
        System.out.println("metoda !!!");
    }

    @Override
    public void cos() {
        System.out.println("cos !!!");
    }
}
