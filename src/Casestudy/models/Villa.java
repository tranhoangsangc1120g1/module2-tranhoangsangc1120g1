package Casestudy.models;

import Casestudy.commoms.FunReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Villa extends Services {
    private String villaStandar;
    private double poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String id, String nameServices, String area, double price,
                 int people, String type, String villaStandar, double poolArea, int floors) {
        super(id, nameServices, area, price, people, type);
        this.villaStandar = villaStandar;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String villaStandar, double poolArea, int floors) {
        this.villaStandar = villaStandar;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String[] villa) {
        super(villa[0], villa[1], villa[2], Double.parseDouble(villa[3]), Integer.parseInt(villa[4]), villa[5]);
        this.villaStandar = villa[6];
        this.poolArea = Double.parseDouble(villa[7]);
        this.floors = Integer.parseInt(villa[8]);
    }

    public String getVillaStandar() {
        return villaStandar;
    }

    public void setVillaStandar(String villaStandar) {
        this.villaStandar = villaStandar;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }


    @Override
    public String toString() {
        return getId() + "," + getNameServices() + "," + getArea() + "," +
                getPrice() + "," + getPeople() + "," + getType() + "," +
                villaStandar + "," + poolArea + "," + floors;
    }

    @Override
    public void showInfor() {
        System.out.println("Villa{" +
                "id='" + getId() + '\'' +
                ", nameServices='" + getNameServices() + '\'' +
                ", area='" + getArea() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", people='" + getPeople() + '\'' +
                ", type='" + getType() + '\'' +
                ", villaStandar='" + villaStandar + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floors='" + floors + '\'' +
                "} "
        );
    }
}
