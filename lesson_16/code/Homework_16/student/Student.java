package Homework_16.student;
//Создать класс Студент (Student) с приватными полями:
//id
//имя
//фамилия
//год рождения
//специализация
//Стандартные методы:
//
//конструктор на все поля;
//геттеры и сеттеры на все поля;
//метод display.
//Дополнительные методы:
//
//учиться
//взять отпуск
//сдать экзамен
//...


public class Student {

    private int id;
    private  String firstName;
    private  String lastName;
    private  int birthYear;
    private String spezialyyation;


//конструктор класса на все поля;


    public Student(int id, String firstName, String lastName, int birthYear, String spezialyyation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.spezialyyation = spezialyyation;
    }

//геттеры и сеттеры


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSpezialyyation() {
        return spezialyyation;
    }

    public void setSpezialyyation(String spezialyyation) {
        this.spezialyyation = spezialyyation;
    }

    //метод дисплей

    public void display(){
        System.out.println( " ID: " + id + ", Name : " + firstName + " , Surname : " + lastName + ", Year of birth :" +
                " " + birthYear + " ,Spezialyyation : " + spezialyyation);
    }

    //Метод имитирующий учебный процесс

    public void study(){
        System.out.println(firstName + "" + lastName + " study ");
    }
    //Метод имитирующий взятие отпуска

    public void takeLeave(){
        System.out.println(firstName + "" + lastName + " take a vacation ");
    }

    //Метод имитирующий сдачу экзамена

    public void passExam(){
        System.out.println(firstName + "" + lastName + " passed the exams ");
    }


}
