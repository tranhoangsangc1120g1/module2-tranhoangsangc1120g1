package session_6.bai_tap.Class2DAndBeD;

import java.util.Arrays;

public class Class2D {
    private float x;
    private float y;

    public Class2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Class2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }
    public void setXY(float newX, float newY){
        this.x=newX;
        this.y=newY;
    }

    @Override
    public String toString() {
        return "Class2D{" +
                "x=" + x +
                ", y=" + y + Arrays.toString(this.getXY()) +
                '}';
    }

    public static void main(String[] args) {
        Class2D class2D=new Class2D(5,8);
        System.out.println(class2D);
    }
}

