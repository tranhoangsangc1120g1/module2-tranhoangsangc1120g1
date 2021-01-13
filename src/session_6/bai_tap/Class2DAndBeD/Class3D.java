package session_6.bai_tap.Class2DAndBeD;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Class3D extends Class2D {
    private float z;

    public Class3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Class3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){

//        float[] arr3d = new float[3];
//
//        arr3d[0]=super.getXY()[0];
//        arr3d[1]=super.getXY()[1];
        float[] arr3d=new float[super.getXY().length+1];
        arr3d=super.getXY();
        arr3d[2]=z;
        return arr3d;
    }

    @Override
    public String toString() {
        return "Class3D{" +
                "z=" + z + Arrays.toString(this.getXYZ()) +
                '}';
    }

    public static void main(String[] args) {
        Class3D class3D=new Class3D(2,3,4);
        System.out.println(class3D);
    }
}
