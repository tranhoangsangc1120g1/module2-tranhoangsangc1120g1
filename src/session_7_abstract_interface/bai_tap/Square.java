package session_7_abstract_interface.bai_tap;

public class Square extends Shape {
    private double size;

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return this.size*this.size;
    }

    @Override
    public void resize(double percent) {
         setSize(getArea()*(1+percent)/100);
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}' ;
    }
}
