package Casestudy.controllers;

import java.util.Scanner;

public class MainControllers {
    Scanner scanner = new Scanner(System.in);
    ManagerServices managerServices = new ManagerServices();
    public static void main(String[] args) {

        MainControllers mainControllers = new MainControllers();
        mainControllers.displayMainMenu();
    }
    public void displayMainMenu() {
        int input;

        do {
            System.out.println("1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            input = scanner.nextInt();
            switch (input){
                case 1: managerServices.addNewServices();
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
                    System.exit(7);
                    break;
            }
        } while (true);
    }

}
