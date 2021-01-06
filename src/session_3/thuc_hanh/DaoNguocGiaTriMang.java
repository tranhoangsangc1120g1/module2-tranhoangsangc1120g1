package session_3.thuc_hanh;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class DaoNguocGiaTriMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[] arr;

        int i=0;
        do {
            System.out.println("nhập n số phần tử của mảng n<=20");
            n = input.nextInt();
            if (n > 20) {
                System.out.println("số phần tử phải nhỏ hơn 20");
            }
        } while (n>20);
        arr=new int[n];

        while (i<n){
            System.out.println("hay nhap phan tu cua mang thứ " +(i+1) +":");
            arr[i]=input.nextInt();
            i++;

        }
        for(int l=0;l< arr.length/2;l++) {
            int temp = arr[l];
            arr[l]= arr[arr.length-1-l];
            arr[arr.length-1-l]=temp;
        }
        System.out.printf("Array:");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+ " ");
        }
    }
}
