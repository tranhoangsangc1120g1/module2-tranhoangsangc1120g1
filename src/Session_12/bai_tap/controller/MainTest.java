package Session_12.bai_tap.controller;

import Session_12.bai_tap.service.CompareCost;
import Session_12.bai_tap.Models.Product;
import Session_12.bai_tap.service.ProductManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        Scanner input = new Scanner(System.in);
        List<Product> listPro = new ArrayList<>();
        listPro.add(new Product("gà", 1000, 1));
        listPro.add(new Product("vịt ", 2000, 2));
        listPro.add(new Product("heo ", 3000, 3));
        listPro.add(new Product("bò ", 4000, 4));
        listPro.sort(new CompareCost());
        for (Product sp:listPro){
            System.out.println(sp);
        }
        while (true) {
            int idNum = 0;
            int choice = 0;
            System.out.println("nhập số để chọn");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    productManager.add(listPro);
                    listPro.sort(new CompareCost());
                    productManager.display(listPro);
                    break;
                case 2:
                    productManager.display(listPro);
                    break;
                case 3 :
                    System.out.println("nhập id muốn xóa");
                    idNum=Integer.parseInt(input.nextLine());
                    productManager.delet(listPro,(idNum-1));
                    productManager.display(listPro);
                        break;
                case 4 :
                    System.out.println("nhập id muốn sửa");
                    idNum=Integer.parseInt(input.nextLine());
                    productManager.edit(listPro,idNum-1);
                    productManager.display(listPro);
                    listPro.sort(new CompareCost());
                    break;
                case 0 :
                    System.exit(0);
                    break;
            }
        }
    }
}
