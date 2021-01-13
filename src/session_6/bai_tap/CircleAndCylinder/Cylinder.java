package session_6.bai_tap.CircleAndCylinder;

public class Cylinder extends Circle {
    public double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Cylinder.super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder1=new Cylinder(2,"violet",2);
        System.out.println(cylinder1 + " \n" +
                "cylindrical volume : " + cylinder1.getVolume());
    }
}
