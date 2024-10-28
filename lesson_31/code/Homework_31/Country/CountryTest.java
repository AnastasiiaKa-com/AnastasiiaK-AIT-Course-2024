package Homework_31.Country;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {
    Country[] countries;

    @BeforeEach
    void setUp() {
        countries = new Country[6];
        countries[0] = new Country("D",500_000_000);
        countries[1] = new Country("U",856_000_000);
        countries[2] = new Country("I",1_500_000_000);
        countries[3] = new Country("T",1_411_000_000);
        countries[4] = new Country("C",213_000_000);
        countries[5] = new Country("N",141_000_000);

    }
    public void printArray(Object[] array,String titleOfReport){
        System.out.println("_________________________" + titleOfReport + "__________________________");
        for (Object o : array){
            System.out.println(o);
        }
    }

    @Test
    void testComparable() {
        printArray(countries,"List of countries sorted by population.");
        Country pattern = new Country(null,500_000_000);
        int index = Arrays.binarySearch(countries,pattern);
        System.out.println(index);
    }

    @Test
    void testComparatorByName() {
        Comparator<Country>
            comparatorByCountryName = new Comparator<Country>(){
                @Override
                public int compare(Country o1, Country o2) {
                    return o1.getName().compareTo(o2.getName());
                }
        };
        Arrays.sort(countries,comparatorByCountryName);
            printArray(countries,"List of countries sorted by name.");
            Country pattern = new Country("Germany",0);
                int index = Arrays.binarySearch(countries,pattern,comparatorByCountryName);
               if(index >= 0){
                    System.out.println("Country" + pattern.getName() + "at index:" + index);

            }else {
                   System.out.println("Country" + pattern.getName() + "not found,but it could be at index" + (-index -1));
               }
        }
    @Test
    void testArrayCopy() {
        Country[] countriesCopy = Arrays.copyOf(countries,countries.length * 2);
        printArray(countriesCopy,"countriesCopy as is");
        System.out.println(countriesCopy.length);
        Comparator<Country> comparatorByName = Comparator.nullsLast((c1,c2) -> c1.getName().compareTo(c2.getName()));
        Arrays.sort(countriesCopy,comparatorByName);
        printArray(countriesCopy,"countriesCopy after sorting by name");
        Country pattern = new Country("Canada",0);
        int index = Arrays.binarySearch(countriesCopy,0,countries.length,pattern,comparatorByName);
        System.out.println(index);
    }

    @Test
    void setPopulation() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }

    @Test
    void compareTo() {
    }
}