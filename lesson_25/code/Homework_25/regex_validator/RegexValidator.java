package Homework_25.regex_validator;
//Создайте регулярные выражения для следующих проверок:
//
//a) Credit card number (8-16 digits)
//b) Date (Format: DD.MM.YYYY)
//c) Date (Format: YYYY-MM-DD)
//d) Phone Number (Format: +99(99)9999-9999)
//e) Number less and equals 255 (positive)
//И проверьте их с помощью тестов в пакете regex_validator

import java.util.regex.Pattern;

public class RegexValidator {
    //Проверка номера кредитной карты(8-16 цифр)
    public static boolean isValidCreditCard(String cardNumber){
        String regex = "^[0-9]{8,16}$";
        //регулярное выражение которое проверяет что строка состоит из 8-16 цифр
        return Pattern.matches(regex,cardNumber);
        //Метод проверяет соответсвует ли строка кард нумер заданному рег выражению
    }
    //Проверка даты в формате DD.MM.YYYY
    public  static boolean isValidDateDDMMYYYY(String date){
        String regex = "^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$";
        //^(0[1-9]|[12][0-9]|3[01]) - Проверяет день от 01 до 31
        //\.(0[1-9]|1[0-2]) - Проверяет месяц от 01 до 12
        //\.\d{4}$- Проверяет что за месяцем следуют 4 цифры года
        return Pattern.matches(regex,date);
    }
    //Проверка номера телефона в формате +99(99)9999-9999
    public static boolean isValidPhoneNumber(String phoneNumber){
        String regex = "^\\+d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$";
        //^\+d{2} - Строка должна нач с символа + и двух цифр
        //\(\d{2}\) -Две цифры в круглых скобках
        //\d{4}-\d{4}$ - Четыре цифры затем дефиз и еще 4 цифры
        return Pattern.matches(regex,phoneNumber);
    }
    //Проверка числа меньше или равного 255
    public  boolean isValidNumberLessThan255(String number){
        String regex = "^(0|[1-9][0-9]?)|([-9]{2})|(2[0-4][0-9])|(25[0-5])$";
        //Регулярное выражение проверяет что число находиться в дапазоне от 0 до 255 с учетом всех возможных вариантов

        return Pattern.matches(regex,number);
    }


}
