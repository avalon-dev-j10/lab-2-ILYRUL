package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;



public class Main {

    public static void main(String[] args) {
    

        Shape[] shapes = new Shape[10];

       shapes[0] = new Rectangle();
        shapes[1] = new Triangle();
        shapes[2] = new Circle() ;
        shapes[3] = new Rectangle();
        shapes[4] = new Triangle();
        shapes[5] = new Triangle();
        shapes[6] = new Rectangle();
        shapes[7] = new Circle();
        shapes[8] = new Triangle();
        shapes[9] = new Rectangle();
        

int shapeNo = 0;
        Shape maxShape = shapes[0];
        float maxArea = shapes[0].getArea();
        for (int x = 0; x < shapes.length; x++){
            if (maxArea < shapes[x].getArea()){
                maxShape = shapes[x];
                maxArea = shapes[x].getArea();
                shapeNo = x;
            }
        }
        System.out.println("Максимальная площадь = " + maxArea + " у фигуры №" 
                + shapeNo);
        }

}
    

