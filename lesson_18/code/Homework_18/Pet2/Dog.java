package Homework_18.Pet2;

public class Dog extends Pet2{

    private double height;
    private double weight;

    public Dog(int id, String species, int age, String name, double height, double weight) {
        super(id, species, age, name);

        this.height = height;
        this.weight = weight;
    }

    public String voice (){
        return " Woof! ";
    }



    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
