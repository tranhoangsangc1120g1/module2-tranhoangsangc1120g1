package session_3.bai_tap;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhập n là số phần tử của mảng 1:");
        int n=input.nextInt();
        System.out.println(" m là số phần tử của mảng 2:");
        int m=input.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("nhập phần tử cho mảng 2 chiều");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println("nhập phần tử : arr["+i+"]"+"["+j+"] =");
                arr[i][j]=input.nextInt();
            }
        }
        int max=0;
        for (int[] element:arr){
            for (int a:element) {
                if (a>max){
                    max=a;
                }
            }
        }
        System.out.println(max);
        }
    }



