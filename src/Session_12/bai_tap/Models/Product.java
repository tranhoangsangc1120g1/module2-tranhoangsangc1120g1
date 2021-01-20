package Session_12.bai_tap.Models;

public  class Product {
    private String name;
    private double cost;
    private int id;

    public Product(String name, double cost, int id) {
        this.name = name;
        this.cost = cost;
        this.id = id;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}
