package Classwork_3;

// Вычислить площадь прямоугольника.
//Задайте длину и ширину прямоугольника как переменные типа double.
//Создайте метод, который получает на вход два числа типа double и возвращает тип double площадь прямоугольника.

public class Rectangle {

    public static void main(String[] args) {

        double a = 125.37;
        double b = 35.0;

        double area = a * b;

        System.out.println("Area of rectangle: " + area);


        area = areaOfRectangle(a, b);
        System.out.println(area);


    } //end of main

    public static double areaOfRectangle(double a, double b) {

        double res = a * b;
        return res;


    }
}//end of class





