package Classwork_18.computer_schop;
//Создать несколько экземпляров каждого класса.
//
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?

import Classwork_18.computer_schop.model.Computer;
import Classwork_18.computer_schop.model.Laptop;

public class SchopAppl {
    public static void main(String[] args) {
        Computer computer = new Computer("i7", 8,256," Acer ", 1200);
        System.out.println( computer );

        Laptop laptop = new Laptop( "M2",8,256,"Apple AirBook",2200,14,1.5,10, " blue ");
        System.out.println( laptop );

        Computer[] computers = new Computer[5];
        computers[0] = new Computer("i7", 8,256," Acer ", 1200);
        computers[1] = new Computer("i5", 16,256," HP ", 1500);
        computers[2] = new Computer("AMD", 8,256," NoName ", 2000);
        computers[3] = new Laptop("M2", 8,256," MacBook ", 2000,14,1.5,10,"white");
        computers[4] = new Laptop("i7", 16,512," Apple ", 2500,14,1.8,10,"black");

        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd();
        }
        System.out.println(" Total  ssd : " + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();

        }
        System.out.println("  Total  price :  + totalPrice");
        System.out.println("_________________________________________");
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand());


        }



    }
}
