package ru.avalon.java.dev.j10.labs.shapes;


public class Triangle implements Shape, Polygon{
    private final float a;
    private final float  b;
    private final float  c;
    private final float  h;
    private final float  x;
    private final float  y;
    private final int rotation;
     
//     public Triangle(double  a,double  b, double  c,double  x, double  y,double  h, int rotation){
//     a = (float)(100*Math.random());
//     b = (float)(100*Math.random());
//     c = (float)(100*Math.random());
//     h = (float)(100*Math.random());
//     x = (float)(100*Math.random());
//     y = (float)(100*Math.random());
//     rotation = (int)(100*Math.random());
//    
//    }

    public Triangle() {
     a = (float)(10*Math.random());
     b = (float)(10*Math.random());
     c = (float)(10*Math.random());
     h = (float)(10*Math.random());
     x = (float)(10*Math.random());
     y = (float)(10*Math.random());
     rotation = (int)(360*Math.random());   
    }

    
    @Override
    public float getPerimeter() {
        
       return  (float) (a+b+c);
       
    }
    
    @Override
    public float getArea() {
        
         double p = (a + b + c) / 2;
        return   (float) Math.sqrt (p * (p - a) * (p - b) * (p - c));
         
        
    }

    public float getX() {
        return (float) x;
    }
    
    public float getY() {
        return (float) y;
    }
    
    @Override
    public int getRotation() {
         return rotation;
    }
    @Override
    public String toString() {
        return "Triangle (" +
                " a = " + a +
                " , h = " + h +
                ')';
    }
}
    

     

