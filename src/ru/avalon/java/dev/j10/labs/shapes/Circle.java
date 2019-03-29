package ru.avalon.java.dev.j10.labs.shapes;


public  class Circle implements Shape, Point, Ellipse{
    private float x;   // точка по х
    private float y;   // точка по y
    private float r;    // радиус
    
    
   
    public Circle() {
        x = (float) (10 * Math.random());  // точка по х
        y = (float) (10 * Math.random());  // точка по y
        r = (float) (10 * Math.random());  // радиус

    }
      
    /*  TODO (Замечания №1 ЛР№2)
        - Дописать комментарии методов класса
        - В некоторых в методах делать принудительное преобразование к типу (float),
        не обязательно, потому что данное выражение и так является float
        - Убрать лишние преобразование к типу (float)!!!
    */
    
    @Override
    public float getArea() {
       return (float) (r * r * Math.PI);
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
    
}

     
   
    


