package Homework_38;
//Задача 1. Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября. Создайте класс DayTemperature c полями:
//LocalDate date;
//double temperature;
import java.time.LocalDate;

public class DayTemperature {
    private LocalDate date;
    private double temperature;

    //constructor


    public DayTemperature(LocalDate date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    //геттеры

    public LocalDate getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }
}
