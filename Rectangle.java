public class Rectangle extends Shape {

    // data
    private double width ;
    private double height;

    // constructors
    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // getters
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    // setters
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // methods
    @Override
    public double calculateArea() {
        return width* height;
    }

    @Override
    public double calculateCircumference() {
        return 2*(width+ height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
