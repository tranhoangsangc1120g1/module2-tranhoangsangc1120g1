package session_1.thuc_hanh;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.Scanner;

public class phuongtrinh_bacnhat {
    public static void main(String[] args) {
        double a,b;
        System.out.println("giai phuong trinh bac nhat");
        System.out.println("phuong trinh 'a*x+b=0', xin moi nhap hang so a và b");
        Scanner phuongtrinhbac1=new Scanner(System.in);
        System.out.println("Nhap a");
        a=phuongtrinhbac1.nextDouble();
        System.out.println("nhap b");
        b=phuongtrinhbac1.nextDouble();
        if (a!=0 ){
            double x=-b/a;
            System.out.println("phuong trinh co mot nghiem duy nhat : " + x);

        }else if(a==0){
            if (b==0){
                System.out.println("phuong trinh vo so nghiem");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
