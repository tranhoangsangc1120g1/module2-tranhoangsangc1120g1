package session_2.thuchanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class timuocchung_lonnhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a :");
        int a = input.nextInt();
        System.out.println("enter b:");
        int b = input.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("ước chung lớn nhất là vô cực");
        } else if (a != 0 && b == 0) {
            a = Math.abs(a);
            System.out.println(" ước chung lơn nhất là " + a);
        } else if (a == 0 && b != 0) {
            b = Math.abs(b);
            System.out.println("ước chung lớn nhất là  " + b);
        } else if (a != 0 && b != 0) {
            int ucln=0;
            if (Math.abs(a) > Math.abs(b)) {
                for (int i = 1; i <= Math.abs(b); i++) {
                    if (Math.abs(a) % i == 0 && Math.abs(b) % i == 0) {
                        ucln = i;
                    }
                }
            } else {
                for (int i = 1; i <= Math.abs(b); i++) {
                    if (Math.abs(a)%i==0 && Math.abs(b)%i==0){
                        ucln=i;
                    }
                }
            }
            System.out.println("Ước chung lớn nhất của hai số là : " + ucln);
        }
    }
}
