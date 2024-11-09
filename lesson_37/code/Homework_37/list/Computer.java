package Homework_37.list;
//Задача 1. На основе класса Computer:
//
//создать собственный ArrayList;
//добавить в него не менее 6 элементов;
//отсортировать список по бренду;
//отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
//подсчитать общий суммарный объем и среднее значение SSD.

public class Computer {
    String brand;
    int ram;//Размер RAM в гб
    int ssd;// Размер в SSD в ГБ

    //Constructor
    public Computer(String brand, int ram, int ssd) {
        this.brand = brand;
        this.ram = ram;
        this.ssd = ssd;
    }

    //Переопределяем метод toString для удобного отображения информации о компьютере
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append('}');
        return sb.toString();
    }
}//end of class
