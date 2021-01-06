package session_2.bai_tap;

import java.util.Scanner;

public class HienThiSntTrongKhoang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {

            System.out.println("1.check có phải là snt không ?");
            System.out.println("2.check snt trong khoảng ");
            System.out.println("0.exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("input numbers want to check");
                    int numcheck = input.nextInt();
                    if (numcheck < 2) {
                        System.out.println(" không phải là snt");
                    } else {
                        for (int i = 2; i <= numcheck; i++) {
                            if (numcheck % i == 0 && numcheck != i) {
                                System.out.println(numcheck + " : không phải là snt");
                                break;
                            } else {
                                System.out.println(numcheck + " : là số nguyên tố ");
                                break;
                            }

                        }

                    }
                    break;
                case 2:
                    System.out.println("nhập khoảng muốn check");
                    int amount = input.nextInt();
                    boolean flag = true;
                    String prime="";
                    for (int i = 2; i <= amount; i++) {
                        flag = true;
                        for (int j = 2; j < i; j++) {
                            if (i%j==0){
                                flag=false;
                                break;
                            }
                        }if (flag==true){
                           prime+= i + ",";
                        }
                    }
                    System.out.println(prime + "là các snt có trong khoảng cần tìm ");
                    break;
                case 0:
                    break;
            }

        }

    }
}
