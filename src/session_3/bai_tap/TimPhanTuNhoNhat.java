package session_3.bai_tap;

import java.util.Scanner;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập n là số phần tử của mảng :");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhâp phần tử thứ " + i + ",");
            arr[i] = input.nextInt();
        }
        System.out.println("arr");
        System.out.println();
        for (int a : arr) {
            System.out.print(a);
        }
        int min = arr[0];
        for (int j = 0; j < n; j++) {
            if (arr[j] < min) {
                arr[j] = min;
            }
        }
        System.out.println("phần tử nhỏ nhất trong mảng là :" + min);

    }
}
