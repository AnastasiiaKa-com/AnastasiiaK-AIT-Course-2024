package Homework_29.garage.car_sorting;

import Homework_29.garage.Car;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class CarImpl {
    public static void main(String[] args) {
        //Создание списка автомобилей
        List<Car> cars = new ArrayList<>();
        //Добавление автомобилей в список
        cars.add(new Car("Toyota", "Red", 20000, 2020));
        cars.add(new Car("BMW", "White", 30000, 2022));
        cars.add(new Car("Ford", "Black", 22000, 2018));
        cars.add(new Car("Mazda", "Blue", 16000, 2010));

        //Сортировка по моделям

        Collections.sort(cars,Car.modelComparator());
        System.out.println("Sorting by models:");
        cars.forEach(System.out::println);

        //Сортировка по цвету
        Collections.sort(cars,Car.colorComparator());
        System.out.println("Sorting by color:");
        cars.forEach(System.out::println);

       // сортировка по стоимости
        Collections.sort(cars,Car.priseComparator());
        System.out.println("Sorting by price:");
        cars.forEach(System.out::println);

        // Сортировка по году выпуска
        Collections.sort(cars,Car.yearComparator());
        System.out.println("Sorting by year:");
        cars.forEach(System.out::println);
    }
}
