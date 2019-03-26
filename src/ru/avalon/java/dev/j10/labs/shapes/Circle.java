package ru.avalon.java.dev.j10.labs.shapes;


public  class Circle implements Shape, Point, Ellipse{
    private float  x;
    private float  y;
    private float r;
    
    
   
    public Circle() {
     x = (float) (10 * Math.random());
     y = (float) (10 * Math.random());
     r = (float) (10 * Math.random());

    }
      
        
    @Override
    public float getArea() {
       return (float) (r*r*Math.PI);
    }
    @Override
    public int getRotation() {
        return 0;
    }

   
    @Override
    public float getLength() {
    return (float) (2*Math.PI*r); 
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
    public String toString() {
        return "Circle (" +
                " r = " + r +
                ')';
    }
}

     
   
    


