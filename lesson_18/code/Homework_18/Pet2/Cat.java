package Homework_18.Pet2;

import Homework_16.pet.Pet;

public class Cat extends Pet2 {

    private double height;
    private double weight;
//
    public Cat(int id, String species, int age, String name,  double height, double weight) {
        super(id, species, age, name);

        this.height = height;
        this.weight = weight;
    }
    public String voice(){
        return " Meow! ";
    }


    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
