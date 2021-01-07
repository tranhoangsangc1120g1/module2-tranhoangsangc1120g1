package session_3.bai_tap;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls input n, n=arr.length");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("pls input element value in the arr : element " + (i + 1));
            arr[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Arr before");
        for (int a : arr) {
            System.out.print(a);
        }
        System.out.println();
        System.out.println("pls Input number to deleted");
        int x = input.nextInt();
        int[] arr2=new int[n];
        int count1=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=x){
                arr2[count1]=arr[i];
                count1++;
            }
        }
        for (int value : arr2) {
            System.out.print(value);
        }
        }
    }

