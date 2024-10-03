package Homework_2;



public class Homework2 {

    public static void main(String[] args){

        //Метод вычисляющий площадь квадрата по его стороне;
        // площадь квадрата со стороной 500 составляет...

        double a = 500;
        double area = areaOfSquare(a);

        System.out.println("Area Of square witch side"+a+"="+area );

        //Метод вычисляющий площадь круга по его радиусу;
        //площадь круга для R = 200 равна ...

        double radius = 200;
        double area1 = areaOfCircle(radius);

        System.out.println("Area Of circle witch radius"+radius+"="+area1);

        //Метод вычисляющий периметр прямоугольника по двум сторонам;
        //периметр прямоугольника со сторонами 1000 и 2000 равен ...

        double side = 1000;
        double side2 = 2000;
        double perimeter = perimeterOfRectangle(side,side2);

        System.out.println("Perimeter of rectangle witch side" + a + " and other side " + side2 + "=");



    }// end of main



    private static double areaOfSquare(double a) {
        return a * a ;


    }

    private static double areaOfCircle(double radius) {



        double Pi = 3.14 ;
        return Pi * radius * radius;

    }
    private static double perimeterOfRectangle(double side, double side2 ) {


        double per = 2 * ( side + side2);
        return per;

    }
}
