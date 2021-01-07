package session_3.bai_tap;

import javax.swing.*;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhâp độ dài của mảng có n-1 phần tử");
        int n=input.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhập phần tử thứ " + i  + "của mảng :" );
            arr[i]=input.nextInt();
        }
        for (int a:arr) {
            System.out.print(a+ " ,");
        }
        System.out.println();
        System.out.println("nhập giá trị muốn thêm vào mảng");
        int x=input.nextInt();
        System.out.println("nhập vị trí muốn thêm vào mảng");
        int index=input.nextInt();
        int[] newArray=new int[n+1];
        for (int i=0;i<index;i++){
            newArray[i]=arr[i];
        }
        newArray[index]=x;
        for (int i=index+1;i<newArray.length;i++){
            newArray[i]=arr[i-1];
        }
        for (int a:newArray) {
            System.out.print(a);
        }
        }
    }

