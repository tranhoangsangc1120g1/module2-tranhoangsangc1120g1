package session_11.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input String");
        String inputString = input.nextLine();
        System.out.println(check(inputString));
    }

    public static boolean check(String inputString) {
        Stack<Character> left = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            if ('(' == inputString.charAt(i)) {
                left.push(inputString.charAt(i));
            } else if (inputString.charAt(i) == ')') {
                if (left.isEmpty()) {
                    return false;
                } else {
                    left.pop();
                }
            }
        }
        return left.isEmpty();



    }
}
