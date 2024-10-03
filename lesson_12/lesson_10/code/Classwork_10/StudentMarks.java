package Classwork_10;
//Имеются оценки абитуриента из его аттестата, всего 12 оценок.
//Найдите средний балл абитуриента.

public class StudentMarks {
    public static void main(String[] args) {

        int []  marks = {1, 6, 4, 3, 1, 2, 3, 3, 2, 5};// обьявление масива в явном виде

        int sum = 0;

        for (int i = 0; i < marks.length ; i++) {
            sum = sum + marks [i];

        }

        System.out.println("Sum = " + sum);

        double averageMarks = (double) sum / marks.length; // CASTING
        System.out.println("Average marks = " + averageMarks);
    }
}
