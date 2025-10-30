public class Triangle extends Shape{

    // data
    private double height;
    private double base;

    // constructors
    public Triangle(){}
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    // getters
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }

    // setters
    public void setHeight(double height) {
        this.height = height;
    }
    public void setBase(double base) {
        this.base = base;
    }

    // methods
    @Override
    public double calculateArea() {
        return (height*base)/2;
    }

    @Override
    public double calculateCircumference() {

        return base*3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
