package pl.camp.it.abstrakcja.stale;

public class App {
    public static void main(String[] args) {
        final int a = 5;
        final Client c = new Client(); //126
        c.setName("Janusz");
        //c = null; //257

        System.out.println(Const.PI);

        for (int i = 0; i < 10; i++) {
            final int x = i;
        }
    }
}
