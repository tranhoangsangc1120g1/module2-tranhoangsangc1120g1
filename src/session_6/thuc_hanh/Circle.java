package session_6.thuc_hanh;

public class Circle extends Shape{
    double  radius=1.0;
    public Circle(){

    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}'+super.toString();
    }

}
