package Casestudy.models;

public abstract class Services {
    private String id;
    private String nameServices;
    private String area;
    private String price;
    private String people;
    private String type;

    public Services(String id, String nameServices, String area, String price, String people, String type) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
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
    public abstract String showInfo();
}
