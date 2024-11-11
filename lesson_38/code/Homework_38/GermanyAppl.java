package Homework_38;
//Сформируйте два ArrayList и внесите в них данные измерений температуры. Рассчитайте среднюю температуру в городе за прошедшие две недели. В какой день была минимальная температура? В какой день максимальная?
////Задача 2. В классе GermanyAppl cоздать LinkedList, содержащий города - столицы земель Германии. Опробовать на нем методы, которые доступны для класса LinkedList. Добавить вольный город Гамбург в начало, в середину списка, в конец списка. Отсортировать список по алфавиту и в обратном порядке.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class GermanyAppl {
    public static void main(String[] args) {
        //Сформируйте два ArrayList и внесите в них данные измерений температуры.
        ArrayList<DayTemperature> octoberTemperatures = new ArrayList<>();
        ArrayList<DayTemperature> nowemberTemperatures = new ArrayList<>();

        //Добавляем данные о температуре для Гамбуга за последнюю неделю октября
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024,10,25),12.5));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024,10,26),13.0));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024,10,27),11.0));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024,10,28),9.5));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024,10,29),10.2));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024,10,30),11.3));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024,10,31),12.0));

        //Добавляем данные о температуре за первую неделю ноября

        nowemberTemperatures.add(new DayTemperature(LocalDate.of(2024,11,1),13.5));
        nowemberTemperatures.add(new DayTemperature(LocalDate.of(2024,11,2),14.0));
        nowemberTemperatures.add(new DayTemperature(LocalDate.of(2024,11,3),12.8));
        nowemberTemperatures.add(new DayTemperature(LocalDate.of(2024,11,4),11.5));
        nowemberTemperatures.add(new DayTemperature(LocalDate.of(2024,11,5),10.7));
        nowemberTemperatures.add(new DayTemperature(LocalDate.of(2024,11,6),9.5));
        nowemberTemperatures.add(new DayTemperature(LocalDate.of(2024,11,7),8.0));

        //Обьединяем данные из обоих списков для анализа
        ArrayList<DayTemperature>
                allTemperatures = new ArrayList<>();
        allTemperatures.addAll(octoberTemperatures);
        allTemperatures.addAll(nowemberTemperatures);

        //Считаем среднюю температуру
        double totalTemperature = 0;
        for (DayTemperature dayTemp : allTemperatures){
            totalTemperature += dayTemp.getTemperature();
        }
        double averageTemperature = totalTemperature / allTemperatures.size();
        System.out.println("The average temperature for two weeks:" + averageTemperature);
        System.out.println("______________________________________________________________________");

        //Находим минимальную и максимальную температуру
        double minTemperature = Double.MAX_VALUE;
        double maxTemperature = Double.MIN_VALUE;
        LocalDate minDate = null;
        LocalDate maxDate = null;
        for (DayTemperature dayTemp : allTemperatures){
            if (dayTemp.getTemperature()< minTemperature){
                minDate = dayTemp.getDate();
            }
            if (dayTemp.getTemperature()> maxTemperature){
                maxTemperature = dayTemp.getTemperature();
                maxDate = dayTemp.getDate();
            }
        }
        System.out.println(" Minimum temperature :" + minTemperature + " in the day " + minDate);
        System.out.println("______________________________________________________________________");

        System.out.println(" Maximum temperature :" + maxTemperature + " in the day " + maxDate);




        //Задача 2. В классе GermanyAppl cоздать LinkedList, содержащий города - столицы земель Германии. Опробовать на нем методы, которые доступны для класса LinkedList. Добавить вольный город Гамбург в начало, в середину списка, в конец списка. Отсортировать список по алфавиту и в обратном порядке.

        LinkedList<String> germanCapitals = new LinkedList<>();
        germanCapitals.add("Berlin");
        germanCapitals.add("Munich");
        germanCapitals.add("Hamburg");
        germanCapitals.add("Drezden");
        germanCapitals.add("Cologne");

        //Добавляем Гамбург в разные позиции списка
        germanCapitals.addFirst("Hamburg(to the beginning)");
        germanCapitals.add(germanCapitals.size()/2,"Hamburg(to the middle)");

        germanCapitals.addLast("Hamburg(to the end)");
        System.out.println("______________________________________________________________________");
        //сортируем список по алфавиту
        Collections.sort(germanCapitals);
        System.out.println("Capitals of the German lands(alphabetically) :" + germanCapitals);
        System.out.println("______________________________________________________________________");
        //сортируем список в обратном порядке
        Collections.sort(germanCapitals,Collections.reverseOrder());
        System.out.println("Capitals of the German lands(in reverse order) :" + germanCapitals);
    }

}
