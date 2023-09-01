public class Circle extends Shape {
    private final double PI = 3.14;
    private double radius;
static int a;
    Circle(String color, double radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }


    @Override
    double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    void display() {
        super.display();
        System.out.println("The area is:" + calculateArea());
        System.out.println("The perimeter is:" + calculatePerimeter());

    }
}
