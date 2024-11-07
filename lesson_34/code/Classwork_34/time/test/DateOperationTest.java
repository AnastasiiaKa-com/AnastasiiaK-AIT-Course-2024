package Classwork_34.time.test;

import Classwork_34.time.utils.DateOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateOperationTest {
//Проверяется, что метод корректно возращает возраст для различных форматов даты

    @Test
    void getAge() {

        assertEquals(63, DateOperation.getAge("12/04/1961"));
        assertEquals(62, DateOperation.getAge("1961-11-28"));
        assertEquals(0,DateOperation.getAge("invalid-date"));//неверный формат
        assertEquals(0,DateOperation.getAge(""));//Пустая строка
    }
//Проверяется корректная сортровка массива дат
    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] actual = DateOperation.sortStringDates(dates);
        String[] expected = {"1970-08-12", "2000-12-01", "10/12/2000", "2010-10-05"};
        assertArrayEquals(expected, actual);//Проверка на соответсвие ожидаемому результату

       // Дополнительный тест с уже отсортированным массивом, чтобы убедиться, что сортировка не меняет порядок если он уже правильный
        String[] alreadySorted = {"2000-12-01","2010-10-05"};
        String[] actualSorted = DateOperation.sortStringDates(alreadySorted);
        assertArrayEquals(alreadySorted,actualSorted);//Проверка, что сортировка не изменила порядок
    }
}

