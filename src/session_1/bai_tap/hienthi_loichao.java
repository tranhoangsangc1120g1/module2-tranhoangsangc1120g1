package session_1.bai_tap;

import java.util.Scanner;

public class hienthi_loichao {
    public static void main(String[] args) {
        Scanner personName=new Scanner(System.in);
        System.out.println("pls input your name");
        String name = personName.nextLine();
        System.out.println("hello " + name);
    }
}
