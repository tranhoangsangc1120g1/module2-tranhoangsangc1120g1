package session_14_exception_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangException {
    public static float[] nhapCanhTamGiac () throws  NumCheckException {
        float a, b, c;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("a");
            a = input.nextFloat();
            System.out.println("b");
            b = input.nextFloat();
            System.out.println("c");
            c = input.nextFloat();
            System.out.println(" 3 cạnh của tam giác lần lượt là cạnh 1 : " + a + "cạnh 2 :" +b +"cạnh 3 : " + c);
            if (a <= 0 || b <= 0 || c <= 0 || (a + b) < c || (b + c) < a || (a + c) < b)
                throw new NumCheckException("check lại số nhập vào");
        } catch (InputMismatchException e){
            throw  new NumCheckException("kí tự nhập vào phải là số ");
        }
        return new float[]{a,b,c};
    }


    public static void main(String[] args) throws NumCheckException {
        try {
             float[] baCanh=nhapCanhTamGiac();
            for (float a : baCanh){
                System.out.print(a + "\t");
            }
        }catch (NumCheckException e){
            System.out.print(e.getMessage());
        }
    }
}


