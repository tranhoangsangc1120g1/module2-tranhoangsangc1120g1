package Casestudy.service;

import Casestudy.commoms.FunReadAndWrite;
import Casestudy.controllers.MainControllers;
import Casestudy.models.Customer;
import Casestudy.models.House;
import Casestudy.models.Room;
import Casestudy.models.Villa;
import Casestudy.regExp.Validation;
import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.*;


public class ManagerServices {
    Validation validation = new Validation();
    Scanner input = new Scanner(System.in);

    public void addNewServices() {
        int choose;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    addVilla();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addRoom();
                    break;
                case 4:
                    MainControllers.displayMainMenu();
                    break;
                case 5:
                    System.exit(5);
            }
        } while (choose != 4);

    }

    public void addVilla() {
        String id;
        String nameServices;
        String area;
        String price;
        String people;
        String type;
        String villaStandar;
        String poolArea;
        String floors;
        List<Villa> listVilla = new ArrayList<>();
        do {
            System.out.println("Enter Id :");
            id = input.nextLine();
        } while (!validation.checkIdServeice(id));
        do {
            System.out.println("Enter name of Services :");
            nameServices = input.nextLine();
        } while (!validation.checkNameofService(nameServices));

        do {
            System.out.println("Enter area :");
            area = input.nextLine();
        } while (!validation.checkArea(area));
        do {
            System.out.println("Enter price :");
            price = input.nextLine();
        } while (!validation.checkPrice(price));
        do {
            System.out.println("Enter amount of people :");
            people = input.nextLine();
        } while (!validation.checkNumPeople(people));
//        do {
            System.out.println("Enter type of rents :");
            type = input.nextLine();
//        } while (!validation.checkTypeofRent(type));
//        do {
        System.out.println("Enter villaStandar :");
        villaStandar = input.nextLine();
//        } while (!validation.checkTypeofRent(villaStandar));
        do {
            System.out.println("Enter poolArea :");
            poolArea = input.nextLine();
        } while (!validation.checkArea(poolArea));
        do {
            System.out.println("Enter floors :");
            floors = input.nextLine();
        } while (!validation.checkFloors(floors));

        Villa villa = new Villa(id, nameServices, area, Double.parseDouble(price),
                Integer.parseInt(people), type, villaStandar, Double.parseDouble(poolArea), Integer.parseInt(floors));
        listVilla.add(villa);
        FunReadAndWrite<Villa> funReadAndWrite = new FunReadAndWrite<>();
        funReadAndWrite.writeFile("Villa.csv", listVilla, true);
    }

    public void addHouse() {
        String id;
        String nameServices;
        String area;
        String price;
        String people;
        String type;
        String houseStandar;
        String floors;
        List<House> listHouse = new ArrayList<>();
        System.out.println("Enter Id :");
        do {
            System.out.println("Enter Id :");
            id = input.nextLine();
        } while (!validation.checkIdServeice(id));
        do {
            System.out.println("Enter name of Services :");
            nameServices = input.nextLine();
        } while (!validation.checkNameofService(nameServices));

        do {
            System.out.println("Enter area :");
            area = input.nextLine();
        } while (!validation.checkArea(area));
        do {
            System.out.println("Enter price :");
            price = input.nextLine();
        } while (!validation.checkPrice(price));
        do {
            System.out.println("Enter amount of people :");
            people = input.nextLine();
        } while (!validation.checkNumPeople(people));
        do {
            System.out.println("Enter type of rents :");
            type = input.nextLine();
        } while (!validation.checkTypeofRent(type));
        do {
            System.out.println("Enter villaStandar :");
            houseStandar = input.nextLine();
        } while (!validation.checkTypeofRent(houseStandar));
        do {
            System.out.println("Enter floors :");
            floors = input.nextLine();
        } while (!validation.checkFloors(floors));
        House house = new House(id, nameServices, area, Double.parseDouble(price),
                Integer.parseInt(people), type, houseStandar,
                Integer.parseInt(floors));
        listHouse.add(house);
        FunReadAndWrite<House> funReadAndWrite = new FunReadAndWrite<>();
        funReadAndWrite.writeFile("House.csv", listHouse, true);
    }

    public void addRoom() {
        String id;
        String nameServices;
        String area;
        String price;
        String people;
        String type;
        String freeService;
        List<Room> listRoom = new ArrayList<>();
        do {
            System.out.println("Enter Id :");
            id = input.nextLine();
        } while (!validation.checkIdServeice(id));
        do {
            System.out.println("Enter name of Services :");
            nameServices = input.nextLine();
        } while (!validation.checkNameofService(nameServices));

        do {
            System.out.println("Enter area :");
            area = input.nextLine();
        } while (!validation.checkArea(area));
        do {
            System.out.println("Enter price :");
            price = input.nextLine();
        } while (!validation.checkPrice(price));
        do {
            System.out.println("Enter amount of people :");
            people = input.nextLine();
        } while (!validation.checkNumPeople(people));
        do {
            System.out.println("Enter type of rents :");
            type = input.nextLine();
        } while (!validation.checkTypeofRent(type));
        do {
            System.out.println("Enter freeservice");
            freeService = input.nextLine();
        } while (!validation.checkNameofService(freeService));

        Room room = new Room(id, nameServices, area, Double.parseDouble(price), Integer.parseInt(people), type, freeService);
        listRoom.add(room);
        FunReadAndWrite<Room> funReadAndWrite = new FunReadAndWrite<>();
        funReadAndWrite.writeFile("Room.csv", listRoom, true);
    }

    public void showNewService() {
        int choose;
        int choose1;
        do {
            System.out.println("1.\tShow New Villa\n" +
                    "2.\tShow New House\n" +
                    "3.\tShow New Room\n" +
                    "4.\tShow All Villa\n" +
                    "5.\tShow All House\n" +
                    "6.\tShow All Room\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    showVilla();
                    break;
                case 2:
                    showHouse();
                    break;
                case 3:
                    showRoom();
                    break;
                case 4:
                    showVillaTreeSet();
                    break;
                case 5:
                    showHouseTreeSet();
                    break;
                case 6:
                    showRoomTreeSet();
                    break;
                case 7:
                    MainControllers.displayMainMenu();
                    break;
                case 8:
                    System.exit(8);
            }
        } while (choose != 4);

    }

    public void showVilla() {
        List<String[]> villaList = FunReadAndWrite.readFile("Villa.csv");
        for (int i = 0; i < villaList.size(); i++) {
            Villa villa = new Villa(villaList.get(i));
            villa.showInfor();
        }
    }

    public void showHouse() {
        List<String[]> houseList = FunReadAndWrite.readFile("House.csv");
        for (int i = 0; i < houseList.size(); i++) {
            House house = new House(houseList.get(i));
            house.showInfor();
        }
    }

    public void showRoom() {
        List<String[]> roomList = FunReadAndWrite.readFile("Room.csv");
        for (int i = 0; i < roomList.size(); i++) {
            Room room = new Room(roomList.get(i));
            room.showInfor();
        }
    }

    public void showVillaTreeSet() {
        Set<String> villaSet = new TreeSet<>();
        List<String[]> villaList = FunReadAndWrite.readFile("Villa.csv");
        for (String[] strings : villaList) {
            villaSet.add(strings[1]);
        }
    }

    public void showHouseTreeSet() {
        Set<String> houseSet = new TreeSet<>();
        List<String[]> houseList = FunReadAndWrite.readFile("House.csv");
        for (String[] strings : houseList) {
            houseSet.add(strings[1]);
        }

        }
    public void showRoomTreeSet() {
        Set<String> roomSet = new TreeSet<>();
        List<String[]> roomList = FunReadAndWrite.readFile("Room.csv");
        for (String[] strings : roomList) {
            roomSet.add(strings[1]);
        }
    }
}