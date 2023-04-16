package pl.camp.it.abstrakcja.example;

public abstract class Algorytm {

    private int a;
    private int b;
    private int c;
    public void calculate() {
        wczytajDane();
        krok1();
        krok2();
        krok3();
        zapisz();
    }

    public abstract void wczytajDane();

    private void krok1() {
        System.out.println("liczenie 1");
    }

    private void krok2() {
        System.out.println("liczenie 2");
    }

    private void krok3() {
        System.out.println("liczenie 3");
    }

    public abstract void zapisz();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
