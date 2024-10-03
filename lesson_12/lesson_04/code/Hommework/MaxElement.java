package Hommework;

//Создайте массив, который содержит возраст студентов группы.
//- какой возраст максимальный?


public class MaxElement {
    public static void main(String[] args) {

        int [] ages = { 47 , 49, 26, 37, 44, 34, 38, 36, 59, 38, 41 };

        int max = ages [11];

        for ( int i = 11; i < ages.length; i++){


            if(ages[i] < max ){
                max = ages[i];

            }
        }

        System.out.println("Max age = " + max);

    }
}
