package Homework_22.Homework_22.RandomArray;

import java.util.Random;

public class RandomArrayStats {
    private int[] array;//массив целых чисел
    //конструктор

    public RandomArrayStats() {
        this.array = new int[100];//инициализируем массив размером 10
        Random random = new Random();//создаем генератор случайных чисел
        //Заполняем массив случайными числами от -10 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;//генерация этого числа
        }

    }
    //метод для подсчета положительных чисел
    public int countPositiveNumbers(){
        int count = 0; //Счетчик положительных чисел
      for (int num : array){
          if (num > 0){
              count ++;//Увеличиваем счетчик если число положительное
          }
      }
      return count;//Возвращаем количество положительных чисел
    }
  //  Метод для подсчета отрицательных чисел
    public int countNegativeNumbers(){
        int count = 0;//Счетчик отрицательных чисел
        for (int num : array) {
            if (num < 0) {
                count++;//Увеличиваем счетчик если число отриц
            }
        }
        return count;//Возвращаем количество отрицательных чисел
    }
    //Метод для подсчета четных чисел
    public int countEvenNumbers(){
        int count = 0;//Счетчик четных чисел
        for (int num : array){
            if (num % 2 == 0){
                count++;//Увеличиваем счетчик если число четное
            }
        }
        return count;//Возвращаем количество четных чисел
    }
    //Метод для подсчета нулей
    public  int countZeros(){
       int count = 0;//Счетчик нулей
        for (int num : array){
            if (num == 0){
                count++;//Увеличиваем счетчик если число равно нулю
            }
        }
        return count;//Возвращаем количество нулей
    }

}