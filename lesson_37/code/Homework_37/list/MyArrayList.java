package Homework_37.list;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList {
    private Computer[] computers; //Массив, который будет хранить компьютеры
    private int size;//Текущий размер (количество добавленных элементов)

    //constructor


    public MyArrayList() {
        computers = new Computer[10];//Начальный размер массива
        size = 0; // Изначально размер равен 0
    }

    //Метод для добавления нового компьютера в список
public void add(Computer computer){
    if (size == computers.length){
        computers = Arrays.copyOf(computers,size *2);//увеличиваем размер

    }
    computers [size++] = computer;
}


//Метод для сортировки по бренду
    public void sortByBrand(){
        Arrays.sort(computers, 0, size, Comparator.comparing(c ->c.brand));
    }

    // Метод для сортировки по RAM и SSd
    public void sortByRamAndSsd(){
        Arrays.sort(computers,0,size,Comparator.comparingInt((Computer c) -> c.ram).thenComparing(c -> c.ssd));
    }
//Метод для подсчета общего обьема и среднего значения SSD
    public void calculateTotalAndAverageSSD(){
        int totalSSD = 0;
        for (int i = 0; i < size; i++) {
            totalSSD += computers[i].ssd;
        }
        double averageSSD = (double) totalSSD / size;
        System.out.println("Total SSD:" + totalSSD + " GB");
    }
    //Метод для вывода компьютеров
    public void printComputers(){
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);

        }
    }

}