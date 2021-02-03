package session_16.bai_tap.Service;

import session_16.bai_tap.Models.Product;
import session_16.bai_tap.comon.FunReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner input=new Scanner(System.in);
    public  void addNewProduct(){
    List<Product> list=new ArrayList<>();
        System.out.println("nhap id");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("nhap ten sp");
        String name=input.nextLine();
        System.out.println("nhap ten cong ty");
        String nameCom=input.nextLine();
        System.out.println("nhap gia sp");
        int price=Integer.parseInt(input.nextLine());
        System.out.println("mo ta sp");
        String description= input.nextLine();
        Product product=new Product(id,name,nameCom,price,description);
        list.add(product);
        FunReadAndWrite.writeProduct(list,true);
    }

    public void showProductList() {
        List<Product> list= FunReadAndWrite.readProduct();
        for (int i=0;i<list.size();i++){
            System.out.println((1+i)+". " +list.get(i));
        }
    }

    public void editProduct() {
        List<Product> list= FunReadAndWrite.readProduct();
        showProductList();
        System.out.println("chon sp muon sua");
        int choose=Integer.parseInt(input.nextLine());
        boolean flag=true;
        while (flag){
            int choose1=Integer.parseInt(input.nextLine());
            System.out.println("chon thong tin can sua \n"+
                    "1. Ten sp \n" +
                    "2. Ten cong ty \n"+
                    "3. Gia sp \n" +
                    "4. Mo ta sp \n" +
                    "5. thoat");
            switch (choose1){
                case 1:
                    System.out.println("sua ten sp");
                    String newName=input.nextLine();
                    list.get(choose-1).setnameProduct(newName);

                    break;
                case 2:
                    System.out.println("sua ten cong ty");
                    String newCom=input.nextLine();
                    list.get(choose1-1).setNameCompany(newCom);
                    break;
                case 3:
                    System.out.println("sua gia");
                    int newPrice=Integer.parseInt(input.nextLine());
                    list.get(choose1-1).setPrice(newPrice);
                    break;
                case 4:
                    System.out.println("sua mo ta");
                    String newdes=input.nextLine();
                    list.get(choose1-1).setDescription(newdes);
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("khong co chuc nang , moi nhap lai");
                    break;
            }
        }
    }

    public void deleteProduct() {
        List<Product> list=FunReadAndWrite.readProduct();
        showProductList();
        System.out.println("chon sp muon xóa");
        int choose=Integer.parseInt(input.nextLine());
        list.remove(choose-1);
        FunReadAndWrite.writeProduct(list,false);
    }

    public void searchByName() {
        List<Product> list=FunReadAndWrite.readProduct();
        System.out.println("nhap ten can tim");

        String nameSearch=input.nextLine();
        for (Product product : list){
            if (product.getnameProduct().contains(nameSearch)){
                System.out.println(product);
            }
        }
    }
}
