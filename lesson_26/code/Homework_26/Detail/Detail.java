package Homework_26.Detail;
// Реализовать приложение по следующему плану:
//
//Абстрактный класс Detail (деталь) с полями:
//
//barCode: long
//Copy
//size: double
//Copy
//material: String
//Copy
//vendor: String
//Copy
//weight: double
//Copy
//Дочерний класс Gear (шестеренка) с полями:
//
//radius: double
//Copy
//tooth: int
//Copy
//Дочерний класс Lever (рычаг) с полями:
//
//power: double
//Copy
//Интерфейс Stock c методами:
//
//добавить деталь на склад
//найти деталь по barCode
//обновить данные о детали
//удалить деталь
//общая масса всех деталей на складе
//средняя масса деталей на складе
//StockImpl
//
//унаследовать методы из интерфейса Stock
//StockImplTest
//
//реализовать тесты

public abstract class Detail {

    private  long barCode;
    private double size;
    private String material;
    private String vendor; //производитель
    private double weight;

    //constructor


    public Detail(long barCode, double size, String material, String vendor, double weight) {
        this.barCode = barCode;
        this.size = size;
        this.material = material;
        this.vendor = vendor;
        this.weight = weight;
    }

    //getters und setters


    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
//Создаем дочерний класс Gear
