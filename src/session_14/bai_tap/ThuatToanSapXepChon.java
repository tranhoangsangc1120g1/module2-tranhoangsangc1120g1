package session_14.bai_tap;

import java.util.Arrays;

public class ThuatToanSapXepChon {
    static int[] list = {3, 4, 5, 2, 1};

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            System.out.println("lần : " + (i + 1));
            /* Find the minimum in the list[i..list.length-1] */
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                    System.out.println(Arrays.toString(list) + " ");
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
                System.out.println(Arrays.toString(list) + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("sau khi sx xong");
        selectionSort(list);
        for (int a : list) {
            System.out.print(a);
        }
    }
}
