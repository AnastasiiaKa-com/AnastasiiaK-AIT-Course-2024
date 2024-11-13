package Homework_39.Student;
//Задача 1.(*) Напишите программу, которая: Создает список студентов, зарегистрированных на два разных курса: "Математика" и "Информатика". Выводит: Список студентов, которые записаны на оба курса. Список студентов, которые записаны только на один из курсов. Условия: Используйте два HashSet для хранения студентов каждого курса. Программа должна использовать операции пересечения и разности множеств для вывода нужных списков.

import java.util.HashSet;
import java.util.Set;

public class StudentCoursesAppl {

    public static void main(String[] args) {
        //Создаем набор студентов для курса математики
        Set<String> mathStuden = new HashSet<>();
        mathStuden.add("Karpenko");
        mathStuden.add("Tihomirova");
        mathStuden.add("Podlesnaya");
        mathStuden.add("Kisin");

       // Создаем набор студентов для курса информатики
       Set<String> csStudents = new HashSet<>();
        csStudents.add("Podlesnaya");
        csStudents.add("Tihomirova");
        csStudents.add("Lepisevych");
        csStudents.add("Karpenko");

        // Находим студентов которые записанны на оба курса
        Set<String> bothCourses =  new HashSet<>(mathStuden);
        bothCourses.retainAll(csStudents);//Операция пересечения множеств

       // Находим студентов записанных только  на один из курсов
        Set<String> onlyMatch = new HashSet<>(mathStuden);
        onlyMatch.removeAll(csStudents);// Удаляем студентов записанных на информатику

        Set<String> onlyCS =  new HashSet<>(csStudents);
        onlyCS.removeAll(mathStuden);//Удаляем студентов записанных на математику

        //
        System.out.println("Students enrolled in both courses:" + bothCourses);
        System.out.println("Students enrolled only in a math course:" + onlyMatch );
        System.out.println("Students enrolled only in a CS   course:" + onlyCS);


    }
}
