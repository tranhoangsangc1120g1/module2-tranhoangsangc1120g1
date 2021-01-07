package session_4.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    private double a, b, c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PhuongTrinhBac2() {
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot() {
        return -this.b / (2 * a);
    }

    public double getRoot1() {
        return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
    }

    public double getRoot2() {
        return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a");
        double a = input.nextDouble();
        System.out.println("input b");
        double b = input.nextDouble();
        System.out.println("input c");
        double c = input.nextDouble();
        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2(a, b, c);
        if (phuongTrinhBac2.getDiscriminant() > 0) {
            System.out.println("root1 = " + phuongTrinhBac2.getRoot1());
            System.out.println("root2 = " + phuongTrinhBac2.getRoot2());
        } else if (phuongTrinhBac2.getDiscriminant() == 0) {
            System.out.println("root = " + phuongTrinhBac2.getRoot());
        } else {
            System.out.println("has no root");
        }
    }
}
