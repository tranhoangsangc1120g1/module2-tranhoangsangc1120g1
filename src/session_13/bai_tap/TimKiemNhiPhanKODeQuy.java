package session_13.bai_tap;

import java.util.ArrayList;

public class TimKiemNhiPhanKODeQuy {
    static int[] listNum={1,2,5,7,9,10,13,15,16,17};
    static int binarytree(int [] list, int key){
        int low=0;
        int high=list.length-1;
        while (high>=low){
            int mid=high-1;
            if (key==list[mid]){
                return mid;
            }else if (key<list[mid]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarytree(listNum,9));
    }
}
