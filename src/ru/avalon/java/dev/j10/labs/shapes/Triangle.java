package ru.avalon.java.dev.j10.labs.shapes;


public class Triangle implements Shape, Point, Polygon{
    private final float a;      // сторона а
    private final float  b;     // сторона b
    private final float  c;     // сторона c
    private final float  h;     // высота
    private final float  x;     // точка по х
    private final float  y;     // точка по y
    private final int rotation;  // ротация
     

    public Triangle() {
     a = (float)(10*Math.random());     // сторона а
     b = (float)(10*Math.random());     // сторона b
     c = (float)(10*Math.random());     // сторона c
     h = (float)(10*Math.random());     // высота
     x = (float)(10*Math.random());     // точка по х
     y = (float)(10*Math.random());     // точка по y
     rotation = (int)(360*Math.random());  // ротация 
    }

    
    @Override
    public float getPerimeter() {
        
       return  (float) (a+b+c);
       
    }
    
    @Override
    public float getArea() {
        
         float p = (a + b + c) / 2;
        return   (float) Math.sqrt (p * (p - a) * (p - b) * (p - c));
         
        
    }

    @Override
    public float getX() {
        return (float) x;
    }
    
    @Override
    public float getY() {
        return (float) y;
    }
    
    @Override
    public int getRotation() {
         return rotation;
    }
    
}
    

     

