package Session_12.bai_tap.service;

import Session_12.bai_tap.Models.Product;

import java.util.Comparator;

public class CompareCost implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getCost()> o2.getCost()){
            return 1;
        }else if (o1.getCost()==o2.getCost()){
            return 0;
        }else {
            return -1;
        }
    }
}
