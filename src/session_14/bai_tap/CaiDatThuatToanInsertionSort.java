package session_14.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CaiDatThuatToanInsertionSort {
    public static void insertionSort(int[] list){
        for (int i=1;i<list.length;i++){
            System.out.println("lần " +i);
            int currentElement =list[i];
            int k;
            for ( k=i-1;k>=0 && list[k]>currentElement;k--){
                    list[k+1]=list[k];
                System.out.println(Arrays.toString(list));
            }
            list[k+1]=currentElement;
            System.out.println(Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        int[] listcheck= {3,4,5,2,1};
        insertionSort(listcheck);
    }
}
