package Homework_37.Planet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainPlanets {
    public static void main(String[] args) {
        List<Planet> planets = new ArrayList<>();//Список для хранения планет

        // Заполняем список планет с их характеристиками
        planets.add(new Planet("Mars",227.9, 6.42e23,2));
        planets.add(new Planet("Saturn",1427, 5.68e26,83));
        planets.add(new Planet("Venus",108.2, 4.87e24,0));
        planets.add(new Planet("Jupiter",778.5, 1.90e27,79));
        planets.add(new Planet("Neptune",4497.1, 1.02e26,14));

        //Вывод списка планет в порядке их расположения
        System.out.println("Sortes by Order:");

        planets.forEach(System.out :: println);  //Вывод информации о каждой планете

        //Сортировка планет по алфавиту
        planets.sort(Comparator.comparing(p -> p.name));

        //Сортировка по имени планеты
        System.out.println("\nSorted by Alhabet:");

        planets.forEach(System.out :: println);// Вывод отсортированных планет

        //Сортировка планет по массе
        planets.sort(Comparator.comparingDouble( p -> p.mass));
        System.out.println("\nSorted by Mass:");
        planets.forEach(System.out :: println);//Вывод отсортированных планет
    }

}
