package Casestudy.models;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class House extends Services  {
    private String houseStandar;
    private int floors;

    public House(String id, String nameServices, String area, double price,
                 int people, String type, String houseStandar, int floors) {
        super(id, nameServices, area, price, people, type);
        this.houseStandar = houseStandar;
        this.floors = floors;
    }

    public House(String houseStandar, int floors) {
        this.houseStandar = houseStandar;
        this.floors = floors;
    }

    public House(String[] house) {
        super(house[0],house[1],house[2],Double.parseDouble(house[3]),Integer.parseInt(house[4]),house[5]);
        this.houseStandar=house[6];
        this.floors=Integer.parseInt(house[7]);
    }


    public String getHouseStandar() {
        return houseStandar;
    }

    public void setHouseStandar(String houseStandar) {
        this.houseStandar = houseStandar;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }


    @Override
    public String toString() {
        return  getId() + "," + getNameServices() + "," + getArea() + "," +
                getPrice() + "," + getPeople() + "," + getType() + "," +
                houseStandar + "," + "," + floors;
    }

    @Override
    public void showInfor() {
        System.out.println("House{" +
                "id='" + getId() + '\'' +
                ", nameServices='" + getNameServices() + '\'' +
                ", area='" + getArea() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", people='" + getPeople() + '\'' +
                ", type='" + getType() + '\'' +
                ", villaStandar='" + houseStandar + '\'' +
                ", floors='" + floors + '\'' +
                "} "
        );
    }
}
