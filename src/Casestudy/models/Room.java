package Casestudy.models;

public class Room extends Services {
    private String freeService;

    public Room(String id, String nameServices, String area, double price, int people, String type, String freeService) {
        super(id, nameServices, area, price, people, type);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameServices, String area, double price, String people, String type, String houseStandar, String floors, String freeService) {
    }

    public Room(String[] room) {
        super(room[0],room[1],room[2],Double.parseDouble(room[3]),Integer.parseInt(room[4]),room[5]);
        this.freeService=room[6];
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return  getId() + "," + getNameServices() + "," + getArea() + "," +
                getPrice() + "," + getPeople() + "," + getType() + "," + freeService;
    }

    @Override
    public void showInfor() {
        System.out.println("Room{" +
                "id='" + getId() + '\'' +
                ", nameServices='" + getNameServices() + '\'' +
                ", area='" + getArea() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", people='" + getPeople() + '\'' +
                ", type='" + getType() + '\'' +
                ", freeService='" +getFreeService()+'\''+
                "} "
        );
    }
}
