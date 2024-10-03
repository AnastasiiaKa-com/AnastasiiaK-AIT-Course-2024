package Homework_8;
//Распечатайте все натуральные числа меньшие 200 и кратные 13. Используйте циклы while и do while.

import java.util.Scanner;

public class TwoHundert {

    public static void main(String[] args) {
        int x = 1;
        int y = 200;
        int z = 13;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Print all natural number,multiple 13,pls :");
        while (x<200)
            x++;
        {
            if(x%13==0){
                System.out.println(x + "");
            }

        }




    }// end of main
}// end of class