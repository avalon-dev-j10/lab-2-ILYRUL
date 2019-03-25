package ru.avalon.java.dev.j10.labs.shapes;


public class Triangle implements Shape, Polygon{
    private double  a;
    private double  b;
    private double  c;
     private int rotation;
     
     public Triangle(double  a,double  b, double  c, int r){
     this.a = a;
     this.b = b;
     this.c = c;
     this.rotation = r;
    
    }

    public float getPerimeter() {
        
       return  (a+b+c);
       
    }
    
    public float getArea() {
        
         double p = (a + b + c) / 2;
        return   Math.sqrt (p * (p - a) * (p - b) * (p - c));
         
        
    }

    
    public int getRotation() {
         return rotation;
    }
}
    

     

