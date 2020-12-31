package session_1.thuc_hanh;

import java.util.Scanner;

public class kiemtra_namnhuan {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("input year wanna check it");
        int yearInput = year.nextInt();
        if (yearInput % 4 == 0) {
            if (yearInput % 100 == 0) {
                if (yearInput % 400 == 0) {
                    System.out.println(yearInput + "this is leapYear");
                } else {
                    System.out.println(yearInput + "this is not a leapYear");
                }
            }else {
                System.out.println(yearInput+"this is a leapYear");
            }
        } else {
            System.out.println(yearInput + "this is Not a leapYear");
        }
    }

}

