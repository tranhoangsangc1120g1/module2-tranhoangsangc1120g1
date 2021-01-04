package session_2.baitap;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class hienthi_cacloaihinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("* * * * * * *");
                    }
                case 2:
                    System.out.println("nhập số để chọn tam giác");
                    System.out.println("1. tam giác đứng");
                    System.out.println("2. tam giac ngược");
                    int choiceTriangle = input.nextInt();
                    System.out.println("nhập chiều cao của tam giác");
                    int height = input.nextInt();
                    switch (choiceTriangle) {
                        case 1:
                            for (int i = 0; i <= height; i++) {
                                for (int j = 0; j <= i; j++)
                                    System.out.print("*");
                                System.out.println("");
                            }
                        case 2:
                            for (int i = 0; i <= height; i++) {
                                for (int j = height - i; j >= 0; j--)
                                    System.out.print("*");
                                System.out.println("");
                            }
                    }
                case 0 :
                    break;
            }
        }
    }
}

