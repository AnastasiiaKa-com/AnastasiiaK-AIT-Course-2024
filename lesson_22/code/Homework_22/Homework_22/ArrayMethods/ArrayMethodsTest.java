package Homework_22.Homework_22.ArrayMethods;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ArrayMethodsTest {
    @Test
    public void  testSumOfElement(){
        int[] array = {1,2,3,4,5};//Пример массива
        int result = ArrayMethods.findFifthElement(array);
        assertEquals(6,result);
    }
    @Test
    public void testSumOfElementInsufficientLength(){
        int[] array= {10,20,30,40,50};
        Integer result = ArrayMethods.findFifthElement(array);
        assertNull(result);
    }

}
