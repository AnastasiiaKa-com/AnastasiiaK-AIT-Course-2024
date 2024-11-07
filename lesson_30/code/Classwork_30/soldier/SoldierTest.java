package Classwork_30.soldier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
//- John, 182, 82.3, 91
//- Peter, 175, 77.1, 75
//- Robin, 162, 55.1, 91
//- Mary, 159, 55.1, 91
//- Ann", 162, 55, 88

class SoldierTest {
    static Soldier[]soldiers;

    @BeforeEach
    void setUp() {
        soldiers = new Soldier[]{
                new Soldier("John,182",182,82.3,91),
                new Soldier("Peter",175,77.1,75),
                new Soldier("John",162,55.1,90),
                new Soldier("Mary",159,70.3,60),
                new Soldier("Ann",162,49.8,55),
        };
    }
    //- отсортировать солдат "естественным" образом - по росту
    @Test
    void testNativeSorting(){
        System.out.println("__________________Print as is_________________________");
        printArray(soldiers);
        Arrays.sort(soldiers);
        System.out.println("__________________Print after native sorting_________________________");
        printArray(soldiers);
    }
//отсортировать по имени
  @Test
  void testSortingByName(){
      Comparator<Soldier> comparatorByName = new Comparator<Soldier>() {
          @Override
          public int compare(Soldier o1, Soldier o2) {
              return - o1.getName().compareTo(o2.getName());//reverse sorting
          }
      };
      System.out.println("__________________Print as is_________________________");
      printArray(soldiers);
      Arrays.sort(soldiers,comparatorByName);// as is
      System.out.println("__________________Print after  sorting by name_________________________");
      printArray(soldiers);

  }
  // по весу
    @Test
    void  testSortingByWeight(){

        System.out.println("__________________Print as is_________________________");
        printArray(soldiers);
        Arrays.sort(soldiers,(w1,w2) -> Double.compare(w1.getWeight(), w2.getWeight()));
        System.out.println("__________________Print sorting by weight_________________________");
        printArray(soldiers);
    }
    //two and more factor for sorting
    @Test
    void  testByNameAndHight(){
        Comparator<Soldier> comparatorNameAndHeight = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int res = o1.getName().compareTo(o2.getName());
                return res != 0 ? res : Integer.compare(o1.getHeight(),o2.getHeight());

            }
        };
        System.out.println("__________________Print as is_________________________");
        printArray(soldiers);
        Arrays.sort(soldiers,comparatorNameAndHeight);
        System.out.println("__________________Print sorting Name and Height_________________________");
        printArray(soldiers);
    }


    //- по значению profile
    @Test
    void testSortSoldiersByProfile(){
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> {
            int res = -(s1.getProfile() - s2.getProfile()); // sort by Profile
            return res !=0 ? res : Integer.compare(s1.getHeight(),s2.getHeight());
        });
        printArray(soldiers);
    }
    //проверить работу метода binarySearch на массиве обьектов
    @Test
    void testBinarySearch(){

        System.out.println("__________________Print as is_________________________");
        printArray(soldiers);
        Arrays.sort(soldiers,(s1,s2) -> (s1.getProfile() - s2.getProfile()));
        System.out.println("__________________Print sorting Name and Height_________________________");
        printArray(soldiers);
        //create object - pattern for searchig
        Soldier pattern = new Soldier(null, 0, 0, 91);
        int index = Arrays.binarySearch(soldiers, pattern, (s1, s2) -> (s1.getProfile() - s2.getProfile()) );
        System.out.println("Index = " + index);
    }



     public void printArray(Object[]array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}//end of class