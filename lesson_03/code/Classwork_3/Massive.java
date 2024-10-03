package Classwork_3;


//**Задача 1.**
//Создайте массив и заполните его целыми числами от 1 до 20.
public class Massive {

    public static void main(String[] args) {

        int[] numbers = new int [21]; //length = 20; index from 0 till 19

        //numbers[0]  - 1st element of array
        // numbers.lengs =20
        // numbers[numbers.length - 1 ]

        //fill in array(масив) numbers

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;

            System.out.print(numbers[i] +"");
        }
        //print array numbers

        System.out.println();
        System.out.println(numbers);// link

    }

}
