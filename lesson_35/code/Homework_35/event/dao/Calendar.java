package Homework_35.event.dao;

import Homework_35.event.dao.model.Event;

import java.time.LocalDateTime;

public interface Calendar {

    boolean addEvent(Event event);//метод для добавления события
    boolean removeEvent(int eventId);//удаления по идентификатору
    boolean updateEvent(int eventId,String title);//Для обновления названия
    Event getEvent(int eventId);//для получения события по идентификатору
    Event[]getAllEvents();//Метод для получения всех событий
    Event[]getEventsBetweenDate(LocalDateTime dateFrom,LocalDateTime dateTo);//Метод для получения событий в диапазоне дат
    int size();//Метод для получения количества событий
}
