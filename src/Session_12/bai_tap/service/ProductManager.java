package Session_12.bai_tap.service;

import Session_12.bai_tap.Models.Product;

import java.util.List;
import java.util.Scanner;

public class ProductManager implements ThemSuaXoa {

    @Override
    public void add(List<Product> list) {
        Scanner input=new Scanner(System.in);
        System.out.println(" nhập tên sp");
        String nameProduct=input.nextLine();
        System.out.println("nhập giá sp");
        double costProduct=Integer.parseInt(input.nextLine());
        System.out.println("nhập mã sp");
        int idProduct=Integer.parseInt(input.nextLine());
        Product newProduct= new Product(nameProduct,costProduct,idProduct);
        list.add(newProduct);
    }

    @Override
    public void display(List<Product> list) {
        for(Product sp :list){
            System.out.println(sp);
        }
    }

    @Override
    public void delet(List<Product> list, int id) {
        for (int i = 0; i <list.size() ; i++) {
            if (i==id){
                list.remove(i);
                break;
            }
        }
    }

    @Override
    public void edit(List<Product> list, int id) {
        for (int i = 0; i <list.size() ; i++) {
            if (i==id){
                Scanner input=new Scanner(System.in);
                System.out.println(" nhập tên sp sau sửa");
                String nameProduct=input.nextLine();
                System.out.println("nhập giá sp sau sửa");
                double costProduct=Integer.parseInt(input.nextLine());

                list.get(i).setName(nameProduct);
                list.get(i).setCost(costProduct);
                break;
            }
        }
    }
}
