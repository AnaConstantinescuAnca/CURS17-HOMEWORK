package com.fasttrackit.homework;

import java.util.List;

public class Countries {
    private String name;
    private String capital;
    private double population;
    private double area;
    private String continent;
    private List<String> neighbour;
    private int id;

    public Countries( int id, String name, String capital, double population, double area, String continent, List<String> neighbour) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbour = neighbour;

    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public String getContinent() {
        return continent;
    }

    public List<String> getNeighbour() {
        return neighbour;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", continent='" + continent + '\'' +
                ", neighbour=" + neighbour +
                ", id=" + id +
                '}';
    }
}
