package session_1.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        System.out.print("input amount");
        Scanner scanner=new Scanner(System.in);
        usd=scanner.nextDouble();
        double total=usd*vnd;
        System.out.println("total usd ==> vnd:" +total);
    }
}
