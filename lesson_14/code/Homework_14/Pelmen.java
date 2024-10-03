package Homework_14;
//  Задача про поиск "счастливого пельменя". Хозяйка налепила для гостей 30 пельменей. В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
//  Напишите программу, которая ищет счастливый пельмень.


import java.util.Random;

public class Pelmen {

    public static void main(String[] args) {
        //cоздать массив для хранения веса 30 пельменей
        int numberOfDumplings = 30;
         int [] dumplingWeights = new int[numberOfDumplings];

            //заполнение массива случайными весами пельменей от 10 до 20 грамм

        Random random = new Random();
        for (int i = 0; i < numberOfDumplings; i++) {
            dumplingWeights[i]= random.nextInt(11)+10;}

            //выбрать случайный пельмень и увеличиваем вес на 15 грамм

            int luckyDumplingsIndex= random.nextInt(numberOfDumplings);//случайный индекс счастливого пельменя
            dumplingWeights[luckyDumplingsIndex]+= 15;//увеличение веса счастливого пельменя на 15

            // поиск счастливого пельменя
            for (int i = 0; i < numberOfDumplings; i++) {
                if (dumplingWeights[i]==(random.nextInt(11)+ 10 + 15)){
                    System.out.println(" A happy dumpling has been found!!!Number :" + (i +1));
                    break;//выход из цикла
                }

            }


        }


    }

