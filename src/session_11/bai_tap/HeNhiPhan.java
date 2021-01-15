package session_11.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class HeNhiPhan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhập số cần chuyển");
        int num=input.nextInt();
        Stack<Integer> stack= new Stack<Integer>() ;
        while (num!=0){
            int du=num%2;
            stack.push(du);
            num=num/2;
        }
//        for (int i=stack.size()-1;i>=0;i--){
//            stack.push(stack.remove(i));
//        }
//        System.out.println("sau khi chuyển qua nhị phân");
//       for (int nhiphan : stack){
//           System.out.print(nhiphan);
//       }
//        cách đúng 2
//        Iterator<Integer> iterator=stack.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
