package session_1.thuc_hanh;

import java.util.Scanner;

public class chiso_cannag {
    public static void main(String[] args) {
        double weight, height;
        Scanner bmiCheck = new Scanner(System.in);
        System.out.println("input weight :" );
        weight = bmiCheck.nextDouble();
        System.out.println("input height :" );
        height = bmiCheck.nextDouble();
        double bmi = weight / (height * height);
        if (bmi >= 30) {
            System.out.println("can not affected by level 10 storms ");
        } else if (bmi >= 25) {
            System.out.println("You are possessing an ideal body");
        } else {
            System.out.println("when it's windy, don't go out");
        }
    }
}
