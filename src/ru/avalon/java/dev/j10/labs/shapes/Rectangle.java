package ru.avalon.java.dev.j10.labs.shapes;


public class Rectangle implements Shape, Polygon{
    private final float  a;     // сторона а
    private final float  b;     // сторона b
    private final float  x;     // точка по х
    private final float  y;     // точка по y
    private final int rotation; // ротация



    public Rectangle() {
     a = (float)(10*Math.random());          // сторона а
     b = (float)(10*Math.random());         // сторона b
     x = (float)(10*Math.random());         // точка по х
     y = (float)(10*Math.random());         // точка по y
     rotation = (int)(360*Math.random());   // ротация
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
    
    }
