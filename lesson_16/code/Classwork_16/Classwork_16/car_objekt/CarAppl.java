package Classwork_16.Classwork_16.car_objekt;

public class CarAppl { public static void main(String[] args) {

    Car myCar = new Car("VW", 2014, 15000, "silver", false); // create object

    myCar.toString();

    System.out.println(myCar);

    myCar.move();
    myCar.stop();

}


}


