package Classwork_34.time.utils;
//В классе DateOperation из классной работы, реализовать метод getAge, принимающий дату рождения в виде стринга, и возвращающий возраст.
//
//Задача 2.
//
//В классе DateOperation из классной работы, реализовать метод sortStringDates, принимающий массив дат в виде массива стрингов, и возвращающий отсортированный массив стрингов-дат.

import org.junit.jupiter.api.DisplayNameGenerator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

import static java.util.Calendar.YEAR;

public class DateOperation {

    //   Метод 'getAge' принимает дату рождения в виде строки и определяет формат даты
    //  С помощью 'SimpleDateFormat' парсит строку в обьект 'Date'.
    //Вычисляет возраст, сравнивая год рождения с текущим годом и проверяя, прошел ли день рождения в текущем году


    public static int getAge(String birthDate) {

        SimpleDateFormat sdf;
        //Определяем формат даты в зависимости от входной строки
        if (birthDate.contains("/")){
            sdf = new SimpleDateFormat("dd/MM/yyyy");
        }else {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        }
        try {
            //Парсим строку в дату
            Date dateOfBirth = sdf.parse(birthDate);
            Calendar birthCal = Calendar.getInstance();
            birthCal.setTime(dateOfBirth);

            //Получаем текущую строку
            Calendar today = Calendar.getInstance();

           // Вычисляем возраст
            int age = today.get(Calendar.YEAR)- birthCal.get(Calendar.YEAR);

            //Проверяем был ли день рождения в текущем году
            if (today.get(Calendar.MONTH)<birthCal.get(Calendar.MONTH)||(today.get(Calendar.MONTH) == birthCal.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < birthCal.get(Calendar.DAY_OF_MONTH))){
                age --;//Если еще не был уменьшаем на 1
            }
            return age;

        } catch (ParseException e) {
            e.printStackTrace();
            return 0;//Возвращаем 0 в случае ошибки парсинга
        }
    }
    //Метод 'sortStringDates'принимает массив строк с датами,использует 'Array.sort()' с компаратором для сортировки
    //Компаратор пытается распарсить каждую дату в нужный формат и сравнивает их

    public static String[] sortStringDates(String[] dates) {
        //Используем компаратор для сортировки дат
        Arrays.sort(dates, new Comparator<String>() {
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            @Override
            public int compare(String date1, String date2) {
                try {
                        //Сначала пытаемся распарсить дату в формате "yyy-MM-dd"
                        Date d1 = date1.contains("/") ? sdf2.parse(date1) : sdf1.parse(date1);
                        Date d2 = date2.contains("/") ? sdf2.parse(date2) : sdf1.parse(date2);
                        return d1.compareTo(d2);

                } catch (ParseException e) {
                    e.printStackTrace();
                    return  0;// В случае ошибки возвращаем 0
                }
            }
        });
        return dates;
    }
}

