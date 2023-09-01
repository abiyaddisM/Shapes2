import java.util.ArrayList;

abstract public class Shape {
    private final String shape;
    private String color;
    Shape(String color,String shape){
        this.color=color;
        this.shape=shape;
    }
    String getColor(){
        return color;
    }
    String getShape(){
        return shape;
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();
    void display(){
        System.out.println("The shape is:"+shape);
        System.out.println("The color is:"+color);

    }
    static ArrayList rearrangeShapes(ArrayList<Shape> shapes){

        for (int i = 0; i < shapes.size(); i++) {
            for (int j = 0; j < shapes.size()-1; j++) {
                if(shapes.get(j).calculateArea() < shapes.get(j+1).calculateArea()){
                    shapes.add(shapes.get(j+1));//Copy the j+1 object as new object
                    shapes.set(j+1,shapes.get(j));//Overwrite j+1 with j
                    shapes.set(j,shapes.get(shapes.size()-1));//Overwrite j with
                    shapes.remove(shapes.size()-1);
                }
            }
        }
        return shapes;
    }


}


