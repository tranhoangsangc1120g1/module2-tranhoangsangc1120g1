package Casestudy.models;

public abstract class Services {
    private String id;
    private String nameServices;
    private String area;
    private double price;
    private int people;
    private String type;

    public Services(String id, String nameServices, String area, double price, int people, String type) {
        this.id = id;
        this.nameServices = nameServices;
        this.area = area;
        this.price = price;
        this.people = people;
        this.type = type;
    }

    public Services() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", area='" + area + '\'' +
                ", price='" + price + '\'' +
                ", people='" + people + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public abstract void showInfor();
}
