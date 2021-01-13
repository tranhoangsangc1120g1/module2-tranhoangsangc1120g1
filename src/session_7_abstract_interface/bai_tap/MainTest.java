package session_7_abstract_interface.bai_tap;

import java.util.Scanner;

public class MainTest {
//    private static Object Circle;
//    private static Object Rectango;
//    private static Object Square;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", true, 1);
        shapes[1] = new Rectango("violet", true, 2, 3);
        shapes[2] = new Square("violet", true, 4);
        Scanner input = new Scanner(System.in);
        long percent = 1 + Math.round(99 * Math.random());
        System.out.println(" nhập %");
        percent=input.nextLong();
//        Circle = (Circle) shapes[0];
//        Rectango =(Rectango) shapes[1];
//        Square =(Square) shapes[2];
        
        shapes[0].resize(percent);
        shapes[1].resize(percent);
        shapes[2].resize(percent);
        for (Shape shape : shapes) {
            if (shape.equals(shapes[0])) {
                System.out.println(shapes[0].getArea());
            } else if (shape.equals(shapes[1])) {
                System.out.println(shapes[1].getArea());
            } else {
                System.out.println(shapes[2].getArea());
            }
        }
    }
}
