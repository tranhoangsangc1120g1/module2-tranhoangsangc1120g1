package session_1.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int lineNumber;
        String chuoi = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("pls Input number to read: ");
            lineNumber = scanner.nextInt();
        } while (lineNumber < 1);
        for (int i = 0; i < lineNumber; i++) {
            System.out.println(chuoi);
        }
    }
}
