package session_4.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
        private double height, width ;
        public LopHinhChuNhat(double height, double width){
            this.height=height;
            this.width=width;
        }
        public double getHeight(){
            return this.height;
        }
        public void setHeight(double newHeight){
            this.height=newHeight;
        }
        public double getWidth(){
           return this.width;
        }
        public void setWidth(double newWidth){
            this.width=newWidth;
        }
        public double getArea(){
            return this.height*this.width;
        }
        public double getPerimeter(){
            return (this.height+this.width)*2;
        }
        public String Display(){
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }

    public static void main(String[] args) {
        double height, width;
        Scanner input=new Scanner(System.in);
        System.out.println("input height");
        height=input.nextDouble();
        System.out.println("input width");
        width=input.nextDouble();
        LopHinhChuNhat hinhChuNhat = new LopHinhChuNhat(height, width);
        System.out.println("rectangle area = " + hinhChuNhat.getArea());
        System.out.println("rectangle Perimeter = " + hinhChuNhat.getPerimeter());
        System.out.println("inpput new height");
        double newHe=input.nextDouble();
        hinhChuNhat.setHeight(newHe);
        hinhChuNhat.setWidth(11);
        System.out.println("rectangle area = " + hinhChuNhat.getArea());
        System.out.println("rectangle Perimeter = " + hinhChuNhat.getPerimeter());
    }
}