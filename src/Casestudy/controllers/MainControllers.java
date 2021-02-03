package Casestudy.controllers;

import Casestudy.models.Employee;
import Casestudy.service.Booking;
import Casestudy.service.ManagerServices;
import Casestudy.service.MangerCustomer;

import java.util.Scanner;

public class MainControllers {
    static Scanner scanner = new Scanner(System.in);
    static ManagerServices managerServices = new ManagerServices();
    static MangerCustomer mangerCustomer = new MangerCustomer();
    static Booking booking=new Booking();
    static Employee employee=new Employee();
    public static void main(String[] args) {

        MainControllers mainControllers = new MainControllers();
        displayMainMenu();
    }

    public static void displayMainMenu() {
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
            switch (input) {
                case 1:
                    managerServices.addNewServices();
                    break;
                case 2:
                    managerServices.showNewService();
                    break;
                case 3:
                    mangerCustomer.addNewCustomer();
                    break;
                case 4:
                    mangerCustomer.showCustomer();
                    break;
                case 5:
                    booking.bookingService();
                    break;
                case 6:
                    employee.showEmployee();
                    break;
                case 7:
                    System.exit(7);
                    break;
            }
        } while (true);
    }

}
