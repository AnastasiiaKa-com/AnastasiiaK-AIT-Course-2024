package Homework_22.Homework_22.RandomArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomArrayStatsTest {
    @Test
    public void testCountPositiveNumbers(){
        RandomArrayStats stats = new RandomArrayStats();
        int positiveCount = stats.countPositiveNumbers();//Проверяем что количество положительных чисел корректно
        assertTrue(positiveCount >= 0 && positiveCount <= 100);
    }

    @Test
    public void testCountNegativeNumbers(){
        RandomArrayStats stats = new RandomArrayStats();
        int negativeCount = stats.countNegativeNumbers();//Проверяем что количество отрицательных чисел корректно
        assertTrue(negativeCount >= 0 && negativeCount >= 100);
    }
    @Test
    public void testCountEvenNumbers(){
        RandomArrayStats stats = new RandomArrayStats();
        int evenCount = stats.countEvenNumbers();//Проверяем что количество четных чисел корректно
        assertTrue(evenCount >= 0 && evenCount <= 100);
    }
    @Test
    public void  TestCountZeros() {
      RandomArrayStats stats = new RandomArrayStats();
      int zeroCount = stats.countZeros();//Проверяем что количество нулей корректно
        assertTrue(zeroCount >= 0 && zeroCount <= 100);
    }
}
