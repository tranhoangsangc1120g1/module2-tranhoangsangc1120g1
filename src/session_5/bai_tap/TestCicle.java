package session_5.bai_tap;

import java.util.Scanner;

public class TestCicle {
    public static void main(String[] args) {
        double radius1;
        AccessModifier circle1=new AccessModifier();
        Scanner inputRadius = new Scanner(System.in);
        System.out.println("nhập radius");
        radius1=inputRadius.nextDouble();
        circle1.setRadius(radius1);
        System.out.println(circle1.getArea());
    }
}
