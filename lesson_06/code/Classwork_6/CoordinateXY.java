package Classwork_6;

//Задание 1.**
//  Задайте в программе две переменные и их значения, которые отвечают за координаты точки на плоскости.
//  Определите в какую четверть попадает точка с этими координатами.

public class CoordinateXY {
    public static void main(String[] args) {

        int  x = 0;
        int y = 0;

        if(x > 0 & y > 0){
            System.out.println("Point is in 1nd quarter");


        }
        if(x <= 0 & y >= 0){
            System.out.println("Point is in 2nd quarter");


        }
        if(x <= 0 & y <= 0) {
            System.out.println("Point is in 3nd quarter");

        }

        if(x >= 0 & y >= 0) {
            System.out.println("Point is in 4nd quarter");
        }
        if(x == 0 & y == 0){
            System.out.println("Point is in(0;0)") ;

        }

    }//end of main


}//end of class

