package Homework_31.Country;

import java.util.Objects;



public class Country implements Comparable<Country> {
    private String name;
    private int population;

    //Constructor
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    //getters und setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
//equals und hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country country)) return false;
        return population == country.population && Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }
    //toString


    @Override
    public String toString() {
        return  String.format("Country name: %s,population: %d",name,population);
    }


    @Override
    public int compareTo(Country o) {
        return Integer.compare(this.getPopulation(),o.getPopulation());
    }
}
