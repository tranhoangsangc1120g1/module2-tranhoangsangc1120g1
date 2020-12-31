package session_1.thuc_hanh;

import java.util.Scanner;

public class songay_trongthang {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("nhap thang muon kiem tra");
        int monthinput = month.nextInt();
        if (monthinput < 12) {
            switch (monthinput) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 10:
                case 12:
                    System.out.println(monthinput + "la thang co 31 ngay ");
                    break;
                case 2:
                    System.out.println(monthinput + "co 28 ngay neu nam khong nhuan , 29 ngay neu la nam nhuan ");
                    break;
                default:
                    System.out.println(monthinput + "co 30 ngay");
            }
        }else {
            System.out.println("so thang nhap vao phai nho hon 12");
        }
    }
}
