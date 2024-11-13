package Homework_39.Currency_exchange;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        //Выводим список валют и их курсов к евро
        System.out.println(" Available currencies and their exchange rates to the euro:");
        for (Currency currency : Currency.values()){
            System.out.printf("%s: %.2f EUR%n",currency.name(),currency.getExchangeRate());
        }

        //Запрашиваем у пользователя выбор валюты и количество
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency code(for example,USD):");
        String currencyCode = scanner.nextLine().toUpperCase();

        try {
            Currency selectedCurrency = Currency.valueOf(currencyCode);
            System.out.println("Enter the quantity: ");
            double amount = scanner.nextDouble();

            //Вычисляем количество евро
            double euros = amount * selectedCurrency.getExchangeRate();
            System.out.printf("You will receive %.2f EUR for %.2f %s.%n", euros, amount, selectedCurrency.name());
        }catch (IllegalArgumentException e){
            System.out.println("Error invalid currency code.");
        }finally {
            scanner.close();
        }

        }//end of main
    
    }//end of class



