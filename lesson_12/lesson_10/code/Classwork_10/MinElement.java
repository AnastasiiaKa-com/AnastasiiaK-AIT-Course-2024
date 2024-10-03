package Classwork_10;

//**Задача 4.**
//Создайте массив, который содержит возраст студентов группы.

//- какой возраст минимальный?

public class MinElement {
    public static void main(String[] args) {

        int [] ages = { 47 , 49, 26, 37, 44, 34, 38, 36, 59, 38, 41 };

        int min = ages [0];

        for ( int i = 0; i < ages.length; i++){


            if(ages[i] < min ){
                min = ages[i];

            }
        }

        System.out.println("Min age = " + min);

    }
}
