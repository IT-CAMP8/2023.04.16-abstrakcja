package pl.camp.it.abstrakcja.statyczne;

public class Client {

    int id;
    private static int counter = 0;

    public Client() {
        counter++;
        this.id = counter;
    }

    public static int getCounter() {
        return counter;
    }
}
