package Homework_29.garage;
//Задание 1. - это приоритет! На примере класса Car с полями модель, цвет, стоимость, год выпуска повторить все то, что делали с классом Wine на занятии. Получить сортированные списки объектов типа Car:
//
//по моделям
//по цвету
//по стоимости
//по году выпуска Реализовать в отдельном пакете car_sorting по аналогии (Car, CarTest)
//Задание 2. Закончить тесты и методы для Car - Garage.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private double price;
    private int year;

    //constructor

    public Car(String model, String color, double price, int year) {

        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
    }
    //getters und setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //Сравнение по моделям
    public static Comparator<Car> modelComparator(){
        return  Comparator.comparing(Car::getModel);
    }
    //Сравнение по цвету
    public static Comparator<Car> colorComparator(){
        return Comparator.comparing(Car::getColor);
    }
    //Сравнение по стоимости
    public  static Comparator<Car> priseComparator(){
        return Comparator.comparingDouble(Car::getPrice);
    }
    //Сравнение по году выпуска
    public static Comparator<Car> yearComparator(){
        return Comparator.comparingInt(Car::getYear);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }

    public static class Garage {
        private List<Car> cars;//Список автомоюилей в гараже

        //constructor

        public Garage() {
            cars = new ArrayList<>() ;
        }
        //Метод для добавления автомобиля в гараж
        public void addCar(Car car){
            cars.add(car);
        }
        //Метод для получения всех автомобилей
        public List<Car> getCars(){
            return  cars;
        }

    }
}
