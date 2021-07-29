package menu;

import util.DBUtil;

import java.util.Scanner;

public class MenuOptions {

    private MenuDelivery menuDelivery;
    private MenuCustomer menuCustomer;

    public MenuOptions() {
        this.menuDelivery = new MenuDelivery();
        this.menuCustomer = new MenuCustomer();
    }

    private int menuOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the menu option: ");
        System.out.println("-------------------------\n");
        System.out.println();
        System.out.println("1: Sub Menu Customer");
        System.out.println("2: Sub Menu Restaurant");
        System.out.println("3: ");
        System.out.println("4: ");
        System.out.println("5: ");
        System.out.println("6: ");
        System.out.println("7: ");
        System.out.println("8: ");
        System.out.println("9: ");
        System.out.println("10: ");

        System.out.println("100 - Quit");

        return input.nextInt();
    }

    public void menuChoice(Scanner input) {

        int userChoice;
        do {
            userChoice = menuOptions(input);
            switch (userChoice) {
                case 1:
                    this.menuCustomer.menuChoice(input);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 100:
                    DBUtil.shutdown();
                    input.close();
                    break;
                default:
                    System.out.println("\nSorry, please enter valid Option");
                    menuOptions(input);
                    break;
            }// End of switch statement
        } while (userChoice != 100);
        System.out.println("Closing system...");
        System.out.println("Thank you. Good Bye.");
    }




}
