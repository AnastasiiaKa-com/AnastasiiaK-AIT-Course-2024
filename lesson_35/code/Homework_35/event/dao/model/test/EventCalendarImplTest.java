package Homework_35.event.dao.model.test;

import Homework_35.event.dao.EventCalendarImpl;
import Homework_35.event.dao.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


class EventCalendarImplTest {

    EventCalendarImpl calendar;// Обьект для тестирования календаря событий

    @BeforeEach
    void setUp() {
        //Метод который выполняется перед каждым тестом
        calendar = new EventCalendarImpl(10);//Инициализация календаря событий емкостью 10
        calendar.addEvent(new Event(1,"BerthDay", LocalDateTime.now().plusDays(1)));
        calendar.addEvent(new Event(2,"Meeting with Mom",LocalDateTime.now().plusDays(2)));
        calendar.addEvent(new Event(3,"Workshop",LocalDateTime.now().plusDays(3)));
    }

    @Test
    void addEvent() {
        assertFalse(calendar.addEvent(null));//Проверка добавления null
        assertEquals(3,calendar.size());//Проверка размера
        assertTrue(calendar.addEvent(new Event(4,"Weding",LocalDateTime.now().plusDays(4))));//Добавление нового события
        assertEquals(4,calendar.size());//Проверка нового размера
    }

    @Test

    void removeEvent() {
        assertTrue(calendar.removeEvent(1));//Удаление события
        assertFalse(calendar.removeEvent(5));//Событие не найдено
        assertEquals(2,calendar.size());
    }

    @Test
    void updateEvent() {
        assertTrue(calendar.updateEvent(1,"Updated BirthDay"));//Обновление названия

        assertEquals("Updated BirthDay",calendar.getEvent(1).getTitle());

    }

    @Test
    void getEvent() {
        assertNotNull(calendar.getEvent(1));//Проверка существующего события
        assertNull(calendar.getEvent(5));//Проверка несуществующего события
    }

    @Test
    void getAllEvent() {
        Event[] events = calendar.getEventsBetweenDate(LocalDateTime.now(),LocalDateTime.now().plusDays(3));
        assertEquals(3,events.length);//Проверка количества событий за период
    }

    @Test
    void getEventsBetweenDate() {
        Event[] events = calendar.getEventsBetweenDate(LocalDateTime.now(),LocalDateTime.now().plusDays(3));
        assertEquals(3,events.length);
    }

    @Test
    void size() {
    }
}