package Hommework;
//Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
// Запишите результаты в массив. Рассчитайте вероятность выпадения орла и решки.

import java.util.Random;

public class Monetka {
    public static void main(String[] args) {

        Random random = new Random(); //cделали обьект

        int [] tossACoin = new  int [100];
        int headsCount = 0;
        int tailsCount = 0;
        //fill in

        for (int i = 0; i < tossACoin.length; i++) {
            //вызов датчика случайных чисел
            int coinFlip = random.nextInt( 2 ) ;//диапазон от 0 до 5 включительно + 1,чтобы сдвинуть от 1 до 6

            System.out.print( coinFlip + " ");


        }

    }
}
