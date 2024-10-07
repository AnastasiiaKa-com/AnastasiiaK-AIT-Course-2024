package Homework_16.student;
//В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.


public class StudentAppl {

    public static void main(String[] args) {
        Student student1 = new Student(1,"Anastasiia","Karpenko",1996,"coding");
        Student student2 = new Student(2,"Olga","Schneider",1887,"design");
        Student student3 = new Student(3,"Artem","Wolf",1999,"testing");
        Student student4 = new Student(4,"Gennadiy","Kovalli",1981,"programmer");
        Student student5 = new Student(5,"Roza","Chaynaya",1972,"analyst");

        student1.display();
        student1.study();
        student1.takeLeave();
        student1.passExam();
        System.out.println("_____________________________________________________");

        student2.display();
        student2.study();
        student2.takeLeave();
        student2.passExam();
        System.out.println("______________________________________________________");

        student3.display();
        student3.study();
        student3.takeLeave();
        student3.passExam();
        System.out.println("______________________________________________________");

        student4.display();
        student4.study();
        student4.takeLeave();
        student4.passExam();
        System.out.println("______________________________________________________");

        student5.display();
        student5.study();
        student5.takeLeave();
        student5.passExam();
        System.out.println("______________________________________________________");

    }
}
