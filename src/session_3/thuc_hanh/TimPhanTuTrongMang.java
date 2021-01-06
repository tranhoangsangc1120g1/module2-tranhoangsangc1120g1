package session_3.thuc_hanh;

import java.util.Scanner;

public class TimPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner inputName=new Scanner(System.in);
        System.out.println("nhập phần tuwrw muốn kiếm");
        String checkName=inputName.nextLine();
        String[] nameList={"vy","Chị vy","vVy","vyvy","VYVY"};
        boolean flag=true;
        for (String ten :nameList) {
            if (checkName.equals(nameList)) {
                System.out.println("có trong trái tim này");
                flag = false;
                break;
            }
        } if (flag){
            System.out.println("không có trong đầu");
        }


    }
}
