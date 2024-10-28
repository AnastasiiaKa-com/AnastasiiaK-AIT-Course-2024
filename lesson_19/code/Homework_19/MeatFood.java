package Homework_19;

import java.util.Objects;
//class Meat Food расширяющий класс Food

public class MeatFood extends Food {

    private String meatType;//тип мяса

    //constructor
    public MeatFood(double price, String name, long barCode, String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }

//переопределение метода toString
    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MeatFood meatFood)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(meatType, meatFood.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meatType);
    }
}
