package pl.camp.it.abstrakcja.statyczne;

public class App {
    public static void main(String[] args) {
        //
        //
        //
        //
        GUI.showMenu();

        System.out.println(GUI.a);
        GUI.a = 10;
        System.out.println(GUI.a);

        GUI gui = new GUI();
        System.out.println(gui.a);

        GUI gui2 = new GUI();
        System.out.println(gui2.a);

        gui.a = 15;

        System.out.println(gui.a);
        System.out.println(gui2.a);

        GUI g = GUI.createGUI();
        GUI g2 = new GUI();
    }
}
