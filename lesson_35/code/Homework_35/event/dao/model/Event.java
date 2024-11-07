package Homework_35.event.dao.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event implements Comparable<Event> {

    private int eventId;// Уникальный идентификатор события
    public String title;//Название события
    private LocalDateTime dateTime;//Дата и время события

    //Конструктор для создания события

    public Event(int eventId, String title, LocalDateTime dateTime) {
        this.eventId = eventId;//Инициализация иидентификатора события
        this.title = title;//Инициализация названия
        this.dateTime = dateTime;//Инициализация даты и времени
    }

    //геттеры для доступа к полям

    public int getEventId() {
        return eventId;}//Возвращает идентификатор события

    public String getTitle() {
        return title;//Возвращает название события

    }
    public LocalDateTime getDateTime() {
        return dateTime;//Возвращает дату и время события
    }

    @Override
    public String toString() {

       //Возвращает строковое представление события
        return "Event{" + "eventId=" + eventId + ",title='"+ title + '\'' + ",dateTime=" + dateTime + '}';
    }

    @Override
    public int compareTo(Event other) {
        //Сравнивает текущее событие с другим, по дате и времени
        return this.dateTime.compareTo(other.dateTime);
    }

    @Override
    public boolean equals(Object o) {
        //Проверяет равенство текущего события с другим обьектом
        if (this == o) return true;// Если ссылки на обьект одинаковы, возвращает тру
        if (!(o instanceof Event event))
            return false;//Если обьект не является событие, возвращает фальш
        return eventId == event.eventId;//Сравнивает идентификаторы событий
    }

    @Override
    public int hashCode() {
        //генерирует хэш код для события
        return Integer.hashCode(eventId);
       // Возвращает хэш код идентификатора события
    }
}
