package Homework_26.Detail.test;

import Homework_26.Detail.Detail;
import Homework_26.Detail.dao.Stock;
import Homework_26.Detail.dao.StockImpl;
import Homework_26.Detail.model.gear.Gear;
import Homework_26.Detail.model.lever.Lever;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StockImplTest {

    @Test
  public   void testAddAndFindDetail() {
        Stock stock = new StockImpl();
        Detail gear = new Gear(1234567890L,10.5,"Steel","VendorA",1.5,5.0,10);
        stock.addDetail(gear);
       // Проверяем что деталь найдена
        assertEquals(gear,stock.findDetailByBarCode(1234567890L));
    }
    @Test
    public void testUpdateDetail() {
        Stock stock = new StockImpl();
        Detail gear = new Gear(1234567890L,10.5,"Steel","VendorA",1.5,5.0,10);
        stock.addDetail(gear);
        //Обновляем деталь
        gear.setWeight(2.0);
        stock.updateDetail(gear);
        //Проверяем обновленный вес
        assertEquals(2.0,stock.findDetailByBarCode(1234567890L).getWeight());
    }
    @Test
   public void testRemoveDetail() {
        Stock stock = new StockImpl();
        Detail gear = new Gear(1234567890L,10.5,"Steel","VendorA",1.5,5.0,10);
        stock.addDetail(gear);
        stock.removeDetail(1234567890L);
       // Проверяем что деталь удалена
        assertNull(stock.findDetailByBarCode(1234567890L));
    }
    @Test
    void testTotalWeight() {
        Stock stock = new StockImpl();
        Detail gear = new Gear(1234567890L,10.5,"Steel","VendorA",1.5,5.0,10);
        stock.addDetail(new Lever(1234567891L,15.0,"Aluminum","VendorB",2.5,100));
        //Проверяем общую массу
        assertEquals(4.0,stock.totalWeight());
    }
    @Test
    void testAverageWeight() {
        Stock stock = new StockImpl();
        Detail gear = new Gear(1234567890L,10.5,"Steel","VendorA",1.5,5.0,10);
        stock.addDetail(new Lever(1234567891L,15.0,"Aluminum","VendorB",2.5,100));
        //Проеряем среднюю массу
        assertEquals(2.0,stock.averageWeight());
    }
}