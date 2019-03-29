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
   
    /*  TODO (Замечания №1 ЛР№2)
        - На основе чего ты создал методы getX() и getY(), проверь свои интрфейсы!
        - Все переменные делать финализированными бесмысленно, данные параметры возможно
        понадобиться изменить при работе с ними. Например: координаты прямоугольника или угол
        повотора, могут меняться, если мы будем перемещать фигуру по плоскости или поворачивать.
        - Стороны прямоугольнка тоже могут меняться.
        - Дописать комментарии методов класса
        - В некоторых в методах делать принудительное преобразование к типу (float),
        не обязательно, потому что данное выражение и так является float
        - Убрать лишние преобразование к типу (float)!!!
    */ 
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
        return  (float) (2 * (a + b));
    }
    
    public float getX() {
        return (float) x;
    }
    
    public float getY() {
        return (float) y;
    }
}
