package Homework_35.event.dao;

import Homework_35.event.dao.model.Event;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.function.Predicate;

public class EventCalendarImpl implements Calendar{

    private Event[] events;//Массив для хранения событий
    private  int size;  //Текущий размер массива

    //конструктор с заданным размером массива
    public EventCalendarImpl(int capacity) {

        this.events = new Event[capacity]; //Инициализация массива событий заданной емкости
        this.size = 0;//Инициализация текущего размера
    }

    @Override
    public boolean addEvent(Event event) {

        if (event == null || size == events.length){

            return false;//Нельзя добавить событие, если оно null или массив полон
        }
        if (getEvent(event.getEventId()) != null){
            return false;// Событие с таким ID уже сужествует
        }
        events[size ++] = event;//Добавление события в массив
        return true;//Возвращает тру если событие успешно добавлено

    }

    @Override
    public boolean removeEvent(int eventId) {
        for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == eventId) {
                System.arraycopy(events, i +1, events,i,size -i -1);//Cдвиг элементов
                events[--size] = null;//Уменьшение размера массва
                return  true;//Возвращает тру если событие успешно удалено
            }
        }
        return false;//Событие не найдено
    }

    @Override
    public boolean updateEvent(int eventId,String title) {
        Event event = getEvent(eventId);
        if (event == null){
            return false;//Событие не найдено
        }
       event.title = title;//Обновление названия события
        return true;//Возвращает тру если название успешно обновлено
    }

    @Override
    public Event getEvent(int eventId) {
        for (int i = 0; i < size; i++) {
 if (events[i].getEventId() == eventId){
     return events[i];//Возврат найденного события
 }
        }
        return null;//Событие не найдено
    }

    @Override
    public Event[] getAllEvents(){
        return Arrays.copyOf(events,size);//Возврат массива событий

    }

    @Override
    public Event[] getEventsBetweenDate(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return findEventsByPredicate(event -> !event.getDateTime().isAfter(dateTo));
    }

    @Override
    public int size() {
        return size;//Возврат текущего размера массива
    }
//Метод для поиска событий по критерию
    private Event[] findEventsByPredicate(Predicate<Event> predicate) {
        Event [] result = new  Event[size];
        int j = 0 ;// Индекс для результирующего массива
        for (int i = 0; i <size; i++) {
      if(predicate.test(events[i])){
      result[j++] = events[i];
    }
}
return Arrays.copyOf(result,j);//обрезка массива до актуального размера

}


}//end of class