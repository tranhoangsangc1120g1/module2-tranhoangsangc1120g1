package session_7_abstract_interface.bai_tap;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public void resize(double percent ) {
         setRadius(getRadius()*(1+percent/100));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + super.toString() ;
    }


}
