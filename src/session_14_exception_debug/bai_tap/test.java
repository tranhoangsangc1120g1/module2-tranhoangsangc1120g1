package session_14_exception_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

class Triangle {
    public static int[] inputTriangleSides() throws NumCheckException {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        try {
            System.out.print("Nhập độ dài cạnh a: ");
            a = sc.nextInt();
            System.out.print("Nhập độ dài cạnh b: ");
            b = sc.nextInt();
            System.out.print("Nhập độ dài cạnh c: ");
            c = sc.nextInt();
            if (a < 0 || b < 0 || c < 0) {
                throw new NumCheckException("Độ dài cạnh không được nhỏ hơn 0.");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new NumCheckException("Tổng độ dài hai cạnh phải lớn hơn cạnh còn lại.");
            }
        } catch (InputMismatchException e) {
            throw new NumCheckException("Độ dài cạnh phải là một số.");
        }
        return new int[]{a, b, c};
    }

    public static void main(String[] args) {
        try {
            int[] sides = inputTriangleSides();
            System.out.print("Độ dài 3 cạnh tam giác lần lượt là: ");
            for (int i : sides) {
                System.out.print(i + "\t");
            }
        } catch ( NumCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}

