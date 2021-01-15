package session_11.bai_tap;

import java.util.*;

public class KiemTraChuoiPalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String stringInput=input.nextLine().toLowerCase();
        Stack stack= new Stack();
        Queue queue=new LinkedList();
        for (int i =0 ;i<stringInput.length();i++){
            stack.push(stringInput.charAt(i));
            queue.add(stringInput.charAt(i));
        }
        if (stack.peek().equals(queue.peek())){
            System.out.println("chuẩn");
        }else {
            System.out.println("không chuẩn");
        }
//       for (int i=stringInput.length()-1;i>=0;i--){
//            queue.add(stringInput.charAt(i));
//        }
//        if (stack.equals(queue)){
//            System.out.println("ờ là nó đó");
//        }else {
//            System.out.println("ờ không phải nó đâu");
//        }
    }

}
