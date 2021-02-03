package Casestudy.service;

import Casestudy.commoms.FunReadAndWrite;
import Casestudy.controllers.MainControllers;
import Casestudy.models.Customer;
import Casestudy.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking {
    ManagerServices managerServices = new ManagerServices();
    MangerCustomer mangerCustomer = new MangerCustomer();
    List<String[]> customerList = FunReadAndWrite.readFile("Customer.csv");

    Scanner input = new Scanner(System.in);
    Customer customer1;
    public void bookingService() {
        mangerCustomer.showCustomer();
        int chooseCus = 0;
        do {
            try {
                System.out.println("Choose Customer");
                chooseCus = Integer.parseInt(input.nextLine());
                if (chooseCus < 1 || chooseCus > customerList.size()) {
                    throw new Exception("Customer is not Exist");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (chooseCus < 1 || chooseCus > customerList.size());
        String[] customer = customerList.get(chooseCus - 1);
       customer1 = new Customer(customer);
        int choose;
        do {
            System.out.println("1.\tBook Villa\n" +
                    "2.\tBook House\n" +
                    "3.\tBook Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    bookVilla();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    System.exit(5);
            }
        } while (choose != 4);
    }

    public void bookVilla() {
        managerServices.showVilla();
        List<String[]> villaList = FunReadAndWrite.readFile("Villa.csv");
        List<Customer> bookingVillaList=new ArrayList<>();

        int chooseVilla = 0;
        do {
            try {
                System.out.println("Choose booking Villa");
                chooseVilla = Integer.parseInt(input.nextLine());
                if (chooseVilla < 1 || chooseVilla > customerList.size()) {
                    throw new Exception("Villa is not Exist");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (chooseVilla < 1 || chooseVilla > villaList.size());
        String[] villa = villaList.get(chooseVilla - 1);
        Villa villa1 = new Villa(villa);
        customer1.setService(villa1);
        bookingVillaList.add(customer1);
        FunReadAndWrite<Customer> funReadAndWrite=new FunReadAndWrite<>();
        funReadAndWrite.writeFile("BookingVilla.csv",bookingVillaList,true);
    }
}
