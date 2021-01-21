package Casestudy.models;

public class House extends Services  {
    private String houseStandar;
    private String floors;

    public House(String id, String nameServices, String area, String price,
                 String people, String type, String houseStandar, String floors) {
        super(id, nameServices, area, price, people, type);
        this.houseStandar = houseStandar;
        this.floors = floors;
    }

    public House(String houseStandar, String floors) {
        this.houseStandar = houseStandar;
        this.floors = floors;
    }

    public String getHouseStandar() {
        return houseStandar;
    }

    public void setHouseStandar(String houseStandar) {
        this.houseStandar = houseStandar;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseStandar='" + houseStandar + '\'' +
                ", floors='" + floors + '\'' +
                '}';
    }

    @Override
    public String showInfo() {
        return houseStandar + ", " +floors;
    }
}
