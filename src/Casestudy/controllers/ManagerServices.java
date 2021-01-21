package Casestudy.controllers;

import java.util.Scanner;

public class ManagerServices {
    Scanner scanner=new Scanner(System.in);
    public void addNewServices(){
        int input;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            input=scanner.nextInt();
            switch (input){
                case 1:
                    addVilla();
                    break;
            }
        }while (input!=4);

    }
    public void addVilla(){
         String id;
         String nameServices;
         String area;
         String price;
         String people;
         String type;
         String villaStandar;
         String poolArea;
         String floors;

        System.out.println("Enter Id :");
         id = scanner.nextLine();
        System.out.println("Enter name of Services :");
         nameServices=scanner.nextLine();
        System.out.println("Enter area :");
         area=scanner.nextLine();
        System.out.println("Enter price :");
         price=scanner.nextLine();
        System.out.println("Enter amount of people :");
         people=scanner.nextLine();
        System.out.println("Enter type of rents :");
         type=scanner.nextLine();
        System.out.println("Enter villaStandar :");
         villaStandar=scanner.nextLine();
        System.out.println("Enter poolArea :");
         poolArea=scanner.nextLine();
        System.out.println("Enter floors :");
         floors=scanner.nextLine();

    }
}
