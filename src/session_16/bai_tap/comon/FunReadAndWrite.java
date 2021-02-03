package session_16.bai_tap.comon;

import session_16.bai_tap.Models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FunReadAndWrite {
    public static final String PATH_FILE = "src/session_16/bai_tap/data/ProductList.txt";
    static File file = new File(PATH_FILE);
    public static void writeProduct(List<Product> list ,boolean selection){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter =new FileWriter(PATH_FILE,selection);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (Product product : list) {
                bufferedWriter.write(product.getInfo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
     public static List<Product> readProduct(){
        List<Product> list=new ArrayList<>();
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;

         try {
             fileReader=new FileReader(PATH_FILE);
             bufferedReader=new BufferedReader(fileReader);
             String[] arr=null;
             String line="";
             while ((line=bufferedReader.readLine()) !=null){
                 arr =line.split(",");
                 Product product=new Product(Integer.parseInt(arr[0]), arr[1],arr[2],Integer.parseInt(arr[3]),arr[4]);
                 list.add(product);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
         return list;
    }
}

