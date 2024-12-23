package Homework_37.Planet;
//Задача 1. На основе класса Computer:
//
//создать собственный ArrayList;
//добавить в него не менее 6 элементов;
//отсортировать список по бренду;
//отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
//подсчитать общий суммарный объем и среднее значение SSD.


public class Planet {
    String name; // Наименование планеты
    double distanceToSun; // Расстояние до Солнца в миллионах километров
    double mass; // Масса планеты в килограммах
    int moons; // Количество спутников

    // constructor

    public Planet(String name, double distanceToSun, double mass, int moons) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.moons = moons;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planet{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distanceToSun=").append(distanceToSun);
        sb.append(", mass=").append(mass);
        sb.append(", moons=").append(moons);
        sb.append('}');
        return sb.toString();
    }



}
