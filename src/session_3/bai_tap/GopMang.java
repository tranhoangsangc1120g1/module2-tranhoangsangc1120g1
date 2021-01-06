package session_3.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls input n, n=arr1.length");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("pls input element value in the arr1 : element" + (i + 1));
            arr1[i] = input.nextInt();
        }
        System.out.println("pls input m,m=arr2.length");
        int m = input.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("pls input element value in the arr2 : element" + (i + 1));
            arr2[i] = input.nextInt();
        }
        System.out.println("Arr1 :");
        for (int a : arr1) {
            System.out.print(a);
        }
        System.out.println();
        System.out.println("Arr2 :");
        for (int b : arr2) {
            System.out.print(b);
        }
        int[] arr3 = new int[n + m];
        for (int i=0;i<=n-1;i++){
            arr3[i]=arr1[i];
        }
        for (int j=0;j<=m-1;j++){
            arr3[n+j]=arr2[j];
        }
            System.out.println();
            System.out.println("Arr3 :");
            for (int c : arr3) {
                System.out.print(c);
            }
        }
    }
