package session_7_abstract_interface.bai_tap;

public class Rectango extends Shape {
    double height;
    double width;

    public Rectango(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public void resize(double percent) {
        setHeight(getHeight()+getHeight()*percent/100);
        setWidth(getWidth()+getWidth()*percent/100);
    }

    @Override
    public String toString() {
        return "Rectango{" +
                "height=" + height +
                ", width=" + width +
                '}'+super.toString();
    }
}
