package session_1.bai_tap;

import java.util.Scanner;

public class chuyendoi_tiente {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        System.out.print("input amount");
        Scanner moneychange=new Scanner(System.in);
        usd=moneychange.nextDouble();
        double total=usd*vnd;
        System.out.println("total usd ==> vnd:" +total);
    }
}
