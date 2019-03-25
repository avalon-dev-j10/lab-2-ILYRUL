package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Ellipse;
import ru.avalon.java.dev.j10.labs.shapes.Point;
import ru.avalon.java.dev.j10.labs.shapes.Polygon;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

       shapes[0] = new Rectangle(4, 3, 50);
        shapes[1] = new Triangle(3, 4, 5, 40);
        shapes[2] = new Circle(0);
        shapes[3] = new Rectangle(0, 0, 0);
        shapes[4] = new Triangle(0, 0, 0, 0);
        shapes[5] = new Triangle(0, 0, 0, 0);
        shapes[6] = new Rectangle(0, 0, 0);
        shapes[7] = new Circle(0);
        shapes[8] = new Triangle(0, 0, 0,0);
        shapes[9] = new Rectangle(0, 0,0);
        
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