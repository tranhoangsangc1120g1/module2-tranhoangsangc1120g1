package session_2.thuc_hanh;

import java.util.Scanner;

public class UngDungTienLai {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("nhap so tien gui");
        double tiengui=input.nextDouble();
        System.out.println("nhap so thang gui");
        int sothang=input.nextInt();
        System.out.println("nhap lai suat theo nam");
        float laisuat=input.nextFloat();
        double tienlai=0;

        for (int i=1;i<=sothang;i++){
           tienlai+= tiengui*sothang*laisuat/100/12;
        }
        double totalMoney=tiengui + tienlai;
        System.out.println(totalMoney);
    }

}
