public class Circle extends Shape{

    // data
    private double radius;
    double pi = 3.14159;

    // constructors
    public Circle (){}
    public Circle (double radius){
        this.radius=radius;
    }

    // getters
    public double getRadius() {
        return radius;
    }

    // setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // methods
    @Override
    public double calculateArea() {
        return ((radius*radius)*pi);
    }

    @Override
    public double calculateCircumference() {
        return (2*radius)*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
