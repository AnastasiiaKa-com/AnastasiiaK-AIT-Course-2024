package Homework_3;

public class Homework {  public static void main(String[] args) {

    // Euros to dollars
    double euro = 1000;
    double dollars = exchangeEuroToDollars(euro);
    System.out.println( "Dollars:"+ dollars);

    //Euros to British pounds
    double euro2 = 1350 ;
    double BritishPounds = exchangeEuroToBritishPounds(euro2);
    System.out.println("BritishPounds:"+ BritishPounds);

    //Euros to Chinese yuan
    double euro3 = 5731 ;
    double Chineseyuan = exchangeEuroToBritishPounds(euro3);
    System.out.println("EuroToChineseYuan:"+ Chineseyuan);

    // Degrees Celsius to degrees Fahrenheit
    double Celsius = 20 ;
    double DegreesFahrenheit = conversionDegreesCelsiusToDegreesFahrenheit(Celsius);
    System.out.println("DegreesFahrenheit="+ DegreesFahrenheit);

    // Miles in kilometers
    double miles = 10 ;
    double Kilometers = conversionMilesInKilometers(miles);
    System.out.println("Kilometers="+ Kilometers);



}  //end of main

    // Euros to dollars
    private static double exchangeEuroToDollars(double euro){

        double rate = 1.11 ;
        return euro*rate;
    }

    //Euros to British pounds
    private static double exchangeEuroToBritishPounds(double euro2){

        double rate = 0.8 ;
        return  euro2*rate;}

    //Euros to Chinese yuan
    private static double exchangeEuroToChineseYuan(double euro3){

        double rate = 7.8 ;
        return  euro3*rate;
    }

    // Degrees Celsius to degrees Fahrenheit

    private static double conversionDegreesCelsiusToDegreesFahrenheit(double celsius){

        double res = 32 ;
        return  celsius*9/5 + res;
    }

    // Miles in kilometers

    private static double conversionMilesInKilometers(double miles){


        return miles * 1.852;


    }






}
