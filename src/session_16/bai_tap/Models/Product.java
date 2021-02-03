package session_16.bai_tap.Models;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Product implements Serializable {
    private static final AtomicInteger atomicInterger=new AtomicInteger(0);
    private int idProduct;
    private String nameProduct;
    private String nameCompany;
    private int price;
    private String description;

    public Product(int idProduct, String nameProduct, String nameCompany, int price, String description) {
        this.idProduct = atomicInterger.incrementAndGet();
        this.nameProduct = nameProduct;
        this.nameCompany = nameCompany;
        this.price = price;
        this.description = description;
    }

    public Product() {
    }

    public static AtomicInteger getAtomicInterger() {
        return atomicInterger;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getnameProduct() {
        return nameProduct;
    }

    public void setnameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';

    }
    public  String getInfo(){
        return idProduct+","+ nameProduct+","+nameCompany+","+price+","+description;
    }
}
