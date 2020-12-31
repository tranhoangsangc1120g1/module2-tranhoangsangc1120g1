package session_1.thuc_hanh;

import java.util.Scanner;

public class sudung_toantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner area=new Scanner(System.in);
        System.out.println("input width");
        width = area.nextFloat();
        System.out.println("input height");
        height=area.nextFloat();
        float Area=width*height;
        System.out.println("dien tich hcn la " +Area);
    }
}
