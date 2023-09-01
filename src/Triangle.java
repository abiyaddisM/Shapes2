public class Triangle extends Shape {
    private double side1,side2,side3,height;
    public Triangle(String color, double side1, double side2, double side3,double height) {
        super(color, "Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height=height;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public double calculateArea() {
        return 0.5*(side1*height);
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The area is: " + calculateArea());
        System.out.println("The perimeter is: " + calculatePerimeter());
    }
}
