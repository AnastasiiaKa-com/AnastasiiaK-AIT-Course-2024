package Classwork_3;

public class Classwork {


    public static void main(String[] args) {
        // 1
        double money = 500; // dollars
        double euro = exchangeDollarsToEuro(money);
        System.out.println( "Euro:"+ euro);
        // 2
        double weight = 200 ; // gramm
        double colorage = 50; // calorie on 100 g
        double energy = calkulateCalorie(weight,colorage);
        System.out.println("Energy=" + energy);
    }// end of main

    //1
    private static double exchangeDollarsToEuro(double money){
        double rate = 0.9 ;
        return money*rate;}
    //2
    private static double calkulateCalorie (double weight,double colorage){

        return weight * colorage / 100;

    }



}// end of class



