//Задача
//
//Реализовать 3 класса геометрических фигур: круг (Circle), квадрат(Square) и
// прямоугольник (Rectangle) . У круга есть радиус, у квадрата и прямоугольника
// -стороны. В каждом классе должен быть метод расчета площади фигуры
// calcArea().
//В main создать List из нескольких разных фигур и посчитать суммарную площадь
// всех фигур в List
//        Напишите  метод, который проверит, есть ли заданная фигура в List
//        Написать метод, который формирует List из фигур, с площадью больше,
//        чем заданное значение


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle circle=new Circle(1);
        System.out.println(circle);
        Square square = new Square (2);
        System.out.println(square);
        Rectangle rectangle=new Rectangle(2,3);
        List<Figure> list=new ArrayList<>();
        list.add(rectangle);
        list.add(square);
        list.add(circle);
        System.out.println(list);
        list.get(0).calcArea();
    }

}