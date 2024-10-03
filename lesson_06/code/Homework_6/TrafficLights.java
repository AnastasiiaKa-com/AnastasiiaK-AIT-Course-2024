package Homework_6;

import java.util.Scanner;

public class TrafficLights {  public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

    System.out.println("Input the color of  the light (red,  yellow,  green ): ");

    String color = scanner.nextLine();

    switch (color) {
        case "red":
            System.out.println("Red ! Stop");
            break;
        case "yellow":
            System.out.println("Yelloy ! Get ready to ride.");
            break;
        case "green":
            System.out.println("Green ! You can ride!!");
            break;
        default:
            System.out.println("Wrong input!");


    }

}
}

