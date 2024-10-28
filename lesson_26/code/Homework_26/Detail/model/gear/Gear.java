package Homework_26.Detail.model.gear;

import Homework_26.Detail.Detail;

public class Gear extends Detail {
//Gear - Шестеренка
    private double radius;//Радиус шестеренки
    private int tooth;//количство зубьев
//constructor
    public Gear(long barCode, double size, String material, String vendor, double weight,double radius,int tooth) {
        super(barCode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;
    }

    //getters und setters


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

}
//Создаем дочерний класс Lever
