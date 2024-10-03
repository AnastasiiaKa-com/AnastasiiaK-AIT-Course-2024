package Homework_10;

//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

public class Temperatur {
     public static void main(String[] args) {

         double []temperatures = { 12.5, 14.0, 15.0, 13.5, 12.0, 14.0, 13.5};
         System.out.println(" Temperature on Tuesday:" + temperatures[1] + "°C" );
         System.out.println(" Thursday's temperaturs:" + temperatures[3] + "°C");

        double sum = 0;
        for (double temp : temperatures){
           sum += temp;
        }
        double averageTemperature = sum / temperatures.length;
         System.out.println("Average temperature over the past week:" + averageTemperature   + "°C");


    }
}
