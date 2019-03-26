package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

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
        
//        Shape maxArea = getMaxArea(shapes);
        Shape max = searcher(shapes); 
    
}
  public static Shape searcher(Shape[] arr) {
        Shape biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getArea() > biggest.getArea()) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
    
    

//    public static Shape getArea(Shape array[], String[] shapes) {
//        Shape max = array[0];
//        for (int i = 0; i < array.length - 1; i++) {
//           System.out.println(shapes[i] + " Площадь фигуры = "  + shapes[i].getArea());
//            if (array[i].getArea() > max.getArea()){
//               Shape maxArea = array[i];
//        }
//        else {
//               Shape maxArea = array[i];
//            }
//        }
////        return max;
//    
//    
//        
//        System.out.println("Фигура с большей площадью " + maxArea + " Площадь: " + maxArea.getArea());
//    }


    


//        Shape maxArea = null;
//        for (int i = 0; i < shape.length; i++) {
//            System.out.println(shape[i] + " Площадь фигуры = "  + shape[i].getArea());
//
//            if (maxArea != null) {
//                if (shape[i].getArea() > maxArea.getArea()) {
//                    maxArea = shape[i];
//                }
//            } else {
//                maxArea = shape[i];
//            }
//        }
//
//        System.out.println("--------------");
//        System.out.println("Фигура с большей площадью " + maxArea + " Площадь: " + maxArea.getArea());
//    }

}