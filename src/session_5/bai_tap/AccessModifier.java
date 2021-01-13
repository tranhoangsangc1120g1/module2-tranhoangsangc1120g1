package session_5.bai_tap;

public class AccessModifier {
    private double radius =1.0d;
    private String color="red";

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public AccessModifier() {
    }
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}
