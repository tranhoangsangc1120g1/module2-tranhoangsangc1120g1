package session_2.bai_tap;

import java.util.Scanner;

public class CheckSnt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. thích tìm bao nhiêu snt đầu tiên cũng có");
            System.out.println("2. không thích tìm nữa thì thoát đỡ nặng máy");
            switch (choice) {
                case 1:
                    System.out.println("nhập số lượng");
                    int numbersPrime = input.nextInt();
                    boolean flag = true;
                    int count = 0;
                    String prime = "";
                    for (int i = 2; i < i + 1; i++) {
                        flag = true;
                        for (int j = 2; j < i; j++) {
                            if (i % j == 0) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag == true) {
                            count++;
                            prime += i + ",";
                            if (count == numbersPrime) {
                                break;
                            }
                        }
                    }
                    System.out.println(prime + " :" + "là " + numbersPrime + " snt đầu tiên");
                    break;
                case 2 :
                    break;
            }
        }
    }
}