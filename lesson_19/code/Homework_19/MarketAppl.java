package Homework_19;
// главный класс

public class MarketAppl {
    public static void main(String[] args) {
        //создание массива с продуктами
        Product[] products = new Product[]{
                new MeatFood(10.0,"Beef",1234556346L,"2022-12-23","Beef"),
                new MilkFood(2.0,"Milk",12334455568L,"2024-11-22","Cow",2.5)
        };
        //печать всех продуктов
        printProducts(products);

        //получение суммы цен всех продуктов
        double totalPrice = getTotalPrice(products);
        System.out.println(" Total Price: " + totalPrice);

        //поиск продукта по штрихкоду
        long barCodeToFind = 1234556346L;
        Product foundProduct = findProductByBarCode(products,barCodeToFind);
        System.out.println(" Found product:" + foundProduct);

    }
    // метод для печати всех продуктов
    public static void
    printProducts(Product[]products){
        for (Product product : products){
            System.out.println(product);
        }
    }
    //метод для получения суммы цен всех продуктов
    public static  double getTotalPrice(Product[]products){
        double total = 0.0;
        for (Product product : products){
            total += product.getPrice();
        }
        return total;
    }
    //метод для поиска продукта по штрих коду
    public  static  Product findProductByBarCode(Product[] products,long barCode){
        for (Product product : products){
            if (product.getBarCode() == barCode){
                return product;//возвращает продукт если найдет
            }
        }
        return  null;//если продукт не найден возвращает пустую строку
    }


}
