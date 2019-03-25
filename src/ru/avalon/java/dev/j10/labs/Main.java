package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Ellipse;
import ru.avalon.java.dev.j10.labs.shapes.Point;
import ru.avalon.java.dev.j10.labs.shapes.Polygon;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

       shapes[0] = new Rectangle(3.2, 1.5, 55);
        shapes[1] = new Triangle(1, 3, 2.5, 40);
        shapes[2] = new Circle(0.2);
        shapes[3] = new Rectangle(3.2, 1.5, 55);
        shapes[4] = new Circle(2.2);
        shapes[5] = new Triangle(2, 4, 5, 170);
        shapes[6] = new Rectangle(2.9, 4, 110);
        shapes[7] = new Circle(1.3);
        shapes[8] = new Triangle(4, 3, 2, 90);
        shapes[9] = new Rectangle(3, 4, 0);
        
        Shape maxArea = getMaxArea(shapes);
    
}
 

    public static Shape getMaxArea(Shape array[]) {
        Shape max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].getArea() > max.getArea()){
                max = array[i];
                
        }
        return max;

        } 
    }

}