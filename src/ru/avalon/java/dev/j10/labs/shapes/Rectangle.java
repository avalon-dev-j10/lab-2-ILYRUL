package ru.avalon.java.dev.j10.labs.shapes;


public class Rectangle implements Shape, Polygon{
    private  float  a;     // сторона а
    private  float  b;     // сторона b
    private  float  x;     // точка по х
    private  float  y;     // точка по y
    private  int rotation; // ротация



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
    
    // метод возвращает площадь прямоугольника
    @Override
    public float getArea() {
       return  (float) (a*b);
    }
    // метод возвращает сторону а прямоугольника
    public float getA() {
        return a;
    }
// метод возвращает сторону b прямоугольника
    public float getB() {
        return b;
        
    }
    // метод возвращает ротацию
    @Override
    public int getRotation() {
        return rotation;
    }
// метод возвращает периметр прямоугольника
       @Override
    public float getPerimeter() {
        return  (float) (2 * (a + b));
    }
    
    // метод возвращает абсциссу х прямоугольника
    public float getX() {
        return  x;
    }
    
    // метод возвращает ординату y прямоугольника
    public float getY() {
        return  y;
    }
}