package Classwork_19.compare_computers;

import Classwork_18.computer_schop.model.Computer;

import java.util.Scanner;

public class ComperComputers {
    public static void main(String[] args) {

        Computer c1 = new Computer("i7",32,1024,"HP",1500);
        System.out.println();
        Scanner scanner = new Scanner(System.in);


 //       System.out.println("Input CPU: ");
 //       String cpu = scanner.nextLine();
 //       System.out.println("Input RAM: ");
 //       int ram = scanner.nextInt();
 //       System.out.println("Input SSD: ");
//        int ssd = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Input brand: ");
//        String brand = scanner.nextLine();
//        System.out.println("Input prise: ");
//        double prise = scanner.nextDouble();

//        // scanner.nextLine();

        Computer c2 = new Computer("i7",32,1024,"HP", 1500);
        System.out.println(c2);

        boolean checker =(c1 == c2);
        System.out.println(checker); // false because links Not equal

        System.out.println("______________________________________________________");

        checker = c1.equals(c2);
        System.out.println(checker);

    }
}
