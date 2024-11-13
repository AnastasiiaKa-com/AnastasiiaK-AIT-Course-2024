package Homework_39.Currency_exchange;
//Задача 2. Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь, что в списке нет дублирующихся кодов валют. Выведите список валют и их курсов на экран. Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать, сколько он получит при обмене на евро.

public enum Currency {
    USD(0.85),  // Доллар США
    GBP(1.15),  // Фунт стерлингов
    JPY(0.007), // Японская иена
    AUD(0.65),  // Австралийский доллар
    CHF(0.92);  // Швейцарский франк

    private final double exchangeRate; // Курс обмена на евро

    Currency(double exchangeRate) {
        this.exchangeRate = exchangeRate;

    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
