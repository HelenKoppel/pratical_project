package menu;

import java.util.Scanner;

public class MainMenu {
    private static MenuOptions menuOptions;
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        menuOptions = new MenuOptions();
        menuOptions.menuChoice(input);
    }

    public static void getMainMenu() {
        menuOptions.menuChoice(input);
    }
}
