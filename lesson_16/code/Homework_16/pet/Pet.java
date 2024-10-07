package Homework_16.pet;
// Создать класс Pet (Домашнее животное) с приватными полями:
//
//id
//вид
//возраст
//кличка
//Стандартные методы:
//
//конструктор на все поля;
//геттеры и сеттеры на все поля;
//метод toString.
//Дополнительные методы:
//
//спать
//есть
//делать звук
//играть
//гулять

public class Pet {

    private int id;
    private  String species;
    private int age;
    private String name;

    ////конструктор на все поля;
    public Pet(int id, String species, int age, String name) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.name = name;
    }
    //геттеры и сеттеры на все поля;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenus() {
        return species;
    }

    public void setGenus(String genus) {
        this.species = genus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //метод toString.
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", genus='" + species + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    ////Дополнительные методы:
    ////
    ////спать
    ////есть
    ////делать звук
    ////играть
    ////гулять
public  void sleep(){
    System.out.println(name + " sleepeng ");
}
public  void  eat(){
    System.out.println( name + " eating ");
}
public void maceSounds (){
    System.out.println(name + " makes a sounds ");
}
public void play (){
    System.out.println(name + " playing ");
}
public void walk (){
    System.out.println(name + " walking ");
}

}
