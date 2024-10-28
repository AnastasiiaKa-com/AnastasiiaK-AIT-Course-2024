package Claswork_21.string_numbers_idd.array_tdd;

import java.util.Arrays;

public class ArrayTdd {
     private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public ArrayTdd(int[]array){

     }

    @Override
    public String toString() {
        return "ArrayTdd{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayTdd arrayTdd)) return false;
        return Arrays.equals(array, arrayTdd.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    // count positive numbers in array

    public int countPositive (int[] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]> 0){
                count++;
            }

        }
        return count;
    }
}
