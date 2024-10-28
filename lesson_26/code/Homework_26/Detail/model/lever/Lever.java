package Homework_26.Detail.model.lever;


import Homework_26.Detail.Detail;
//Lever - рычаг

public class Lever extends Detail {

    private double power; //Мощность рычага
//construktor
    public Lever(long barCode, double size, String material, String vendor, double weight, double power) {
        super(barCode, size, material, vendor, weight);
        this.power = power;
    }
//getters und setters
    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

}
//Создаем интерфейс Stock
