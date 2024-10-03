package Homework_5;

//Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.
public class Minimum {
public static void main(String[] args) {


    int a = 300;
    int b = 450;

    int min = minimum(a, b);
    System.out.println("Minimum=" + min);
}

private static int minimum(int a, int b) {

    int min;
    if (a >= b) {
        min = b;
    } else {
        min = a;

    }
    return min;

}
}
