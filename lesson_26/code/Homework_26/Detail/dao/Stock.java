package Homework_26.Detail.dao;

import Homework_26.Detail.Detail;

public interface Stock {
    void addDetail(Detail detail);//Добавить деталь на склад
    Detail findDetailByBarCode(long barCode);// Найти деталь по штрх коду
    void updateDetail(Detail detail);//Обновить данные о детали
    void removeDetail(long barCode);//Удалить делать
    double totalWeight();//Общая масса всех деталей на складе
    double averageWeight();//Средняя масса деталей на складе

}
//реализовать интерфейс StockImpl
