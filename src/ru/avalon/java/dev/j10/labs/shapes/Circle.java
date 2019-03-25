package ru.avalon.java.dev.j10.labs.shapes;


public abstract class Circle implements Shape, Ellipse{
    double r;
    
        public Circle(double r);
        this.r = r;
 

   
    public double getArea() {
               
        return r*r*Math.PI;
    }

        
    @Override
    public double getLength() {
      return 2*r*Math.PI; 
    }

    
    public int getRotation(int rotation) {
         return rotation;
    }
}
