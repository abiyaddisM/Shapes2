/*
NAME:Abiy Addis
ID:PT1512
*/

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Creating an array liist of colors
        ArrayList<String>colors=new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");

        //Creating an array list of the shapes
        Random random=new Random();
        ArrayList<Shape>shapes=new ArrayList<Shape>();

        //Instantiating a random number of shapes with random values
        for (int i = 0; i < random.nextInt(1,3); i++) {
            shapes.add(new Circle(colors.get(random.nextInt(3)),random.nextInt(1,20)));
            shapes.add(new Rectangle(colors.get(random.nextInt(3)),random.nextInt(1,20),random.nextInt(1,20)));
            shapes.add(new Triangle(colors.get(random.nextInt(3)),random.nextInt(1,20),random.nextInt(1,20),random.nextInt(1,20),random.nextInt(1,20)));
        }

        //Rearranges the shapes by area
        shapes=Shape.rearrangeShapes(shapes);

        //Displays the rearranged shapes
        for (Shape i: shapes) {
            i.display();
            System.out.println();
        }


    }
}