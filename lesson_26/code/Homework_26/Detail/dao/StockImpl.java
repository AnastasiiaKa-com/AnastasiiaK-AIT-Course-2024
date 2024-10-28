package Homework_26.Detail.dao;

import Homework_26.Detail.Detail;

import java.util.ArrayList;
import java.util.List;
//Класс StockImpl реализующий интерфейс Stock
public class StockImpl implements Stock {
    private List <Detail>details; //Список деталей на складе
//constructor
    public StockImpl() {
        this.details = new ArrayList<>();//Инициализация списка
    }
    @Override
    public void addDetail(Detail detail) {
        details.add(detail);//Добавление детали в список

    }
    @Override
    public Detail findDetailByBarCode(long barCode) {
        for (Detail detail : details) {
            if (detail.getBarCode() == barCode) {
                return detail;//Возвращаем найденную деталь
            }
        }
        return null;//Если не найдено
    }
    @Override
    public void updateDetail(Detail detail) {
            for (int i = 0; i < details.size(); i++) {
                if (details.get(i).getBarCode() == detail.getBarCode()){
                    details.set(i,detail);//Обновление детали
                    return;
                    }
                }
            }
    @Override
    public void removeDetail(long barCode) {
        details.removeIf(detail -> detail.getBarCode() == barCode);//Удаление детали по штрих коду
    }
    @Override
    public double totalWeight() {
        double total = 0;
        for (Detail detail : details){
            total += detail.getWeight();//Суммирование веса всех деталей
        }
        return total;
    }
    @Override
    public double averageWeight() {
        if (details.isEmpty()){
            return 0;//Если нет деталей возвращаем 0
        }
        return totalWeight() / details.size();//Возвращаем средний вес
    }
}
