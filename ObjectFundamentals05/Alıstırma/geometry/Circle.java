package ObjectFundamentals05.Alıstırma.geometry;

public class Circle {
    private  double radius ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
}
