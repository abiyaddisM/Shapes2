public class Rectangle extends Shape {
    private double length, width;

    Rectangle(String color, double length, double width) {
        super(color, "Rectangle");
        this.length = length;
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }


    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    void display() {
        super.display();
        System.out.println("The area is:" + calculateArea());
        System.out.println("The perimeter is:" + calculatePerimeter());

    }
}
