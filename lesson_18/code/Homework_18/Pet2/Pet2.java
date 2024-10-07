package Homework_18.Pet2;

// В классе Pet имеются поля:
//
//id
//вид
//возраст
//кличка
//Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями:
//
//порода
//рост
//вес


public class Pet2 {
    private int id;
    private  String species;
    private int age;
    private String name;

    public Pet2(int id, String species, int age, String name) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.name = name;
    }
// геттеры для доступа к полям


    public int getId() {
        return id;
    }

    public String getGenus() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //метод для получения звука питомца
    public String voice (){

        return "";
    }


}



