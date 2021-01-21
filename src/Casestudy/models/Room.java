package Casestudy.models;

public class Room extends Services {
    private String freeService;

    public Room(String id, String nameServices, String area, String price, String people, String type, String freeService) {
        super(id, nameServices, area, price, people, type);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public String showInfo() {
        return freeService;
    }
}
