package pl.camp.it.abstrakcja.statyczne;

public class GUI {

    static {
        System.out.println("ABC");
    }

    public static int a = 5;

    public GUI() {
        a++;
    }
    public static void showMenu() {
        System.out.println("MENU !!!");
    }

    public static GUI createGUI() {
        return new GUI();
    }
}
