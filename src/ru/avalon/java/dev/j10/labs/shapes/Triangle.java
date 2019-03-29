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
         
        /*  TODO (Замечания №1 ЛР№2)
            - Все переменные делать финализированными бесмысленно, данные параметры возможно
            понадобиться изменить при работе с ними. Например: координаты треугольника или угол
            повотора, могут меняться, если мы будем перемещать фигуру по плоскости или поворачивать.
            - Стороны и высота треугольнка тоже могут меняться.
            - Если ты рандомно создаешь три стороны
            треугольника, ты должна соблюдать главное его правило - "Сумма любых двух
            сторон, должна быть больше чем третья"
            - Например, у тебя может создаться треугольник со сторонами 1, 2 и 10.
            Такой треугольник невозможно построить и не выполняется правило
            1 + 2 > 10 - ложь, поэтому возникает NaN
            - Исправить метод создания треугольника, задав условия создания сторон треугольника!!!
            - Дописать комментарии методов класса
            - В некоторых в методах делать принудительное преобразование к типу (float),
            не обязательно, потому что данное выражение и так является float
            - Убрать лишние преобразование к типу (float)!!!
        */
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
    

     

