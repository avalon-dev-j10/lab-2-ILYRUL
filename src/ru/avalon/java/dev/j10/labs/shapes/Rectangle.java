package ru.avalon.java.dev.j10.labs.shapes;


public class Rectangle implements Shape, Polygon{
    private final float  a;
    private final float  b;
    private final float  x;
    private final float  y;
    private final int rotation;

//    public Rectangle(double  a, double  b, double  x, double  y, int rotation){
//     a = (float)(100*Math.random());
//     b = (float)(100*Math.random());
//     x = (float)(100*Math.random());
//     y = (float)(100*Math.random());
//     rotation = (int)(100*Math.random());
//    }

    public Rectangle() {
     a = (float)(100*Math.random());
     b = (float)(100*Math.random());
     x = (float)(100*Math.random());
     y = (float)(100*Math.random());
     rotation = (int)(360*Math.random());
    }
   
 
    @Override
    public float getArea() {
       return  (float) (a*b);
    }
    
    @Override
    public int getRotation() {
        return rotation;
    }

       @Override
    public float getPerimeter() {
        return  (float) (2*(a+b));
    }
    
    public float getX() {
        return (float) x;
    }
    
    public float getY() {
        return (float) y;
}
    
    @Override
    public String toString() {
        return "Rectangle (" + " a = " + a + ", b = " + b +')';                    
    }
}
