package Homework_37.list;

public class MediaMarkt {
    public static void main(String[] args) {

        MyArrayList myList = new  MyArrayList();

        //Добавляем компьютеры
        myList.add(new Computer("Siemens",8,256));
        myList.add(new Computer("Apple",16,512));
        myList.add(new Computer("Lenovo",8,256));
        myList.add(new Computer("Asus",32,1024));
        myList.add(new Computer("Acer",8,128));

        //Сортируем список по бренду и выводим результат
        System.out.println("Sorted by brand:");
        myList.sortByBrand();//Сортировка по бренду
        myList.printComputers();//Вывод отсортированных компьютеров

       // Сортируем список по RAM и SSD и выводим результат
        System.out.println("\nSorted by Ram and SSD:");
        myList.sortByRamAndSsd();// Сортировка по RAM и SSD
        myList.printComputers();//Вывод отсортированных комьютеров

        //Подсчитываем и выводим общий и средний обьем SSD
        myList.calculateTotalAndAverageSSD();


    }
}
