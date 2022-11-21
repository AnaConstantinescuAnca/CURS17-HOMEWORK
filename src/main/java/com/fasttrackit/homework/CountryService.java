package com.fasttrackit.homework;

import java.util.List;

public class CountryService {
    private static String pathFile; //= "files/Countries2.txt";
    private static List<Countries> countriesList;
    //- list all country names :  -> returns a list of strings
       static List<String> allCountriesName = getList().stream()
            .map(Countries::getName)
            .toList();
    //- get capital of a country :  -> returns a string
    static List<String> allCountriesCapital = getList().stream()
            .map(Countries::getCapital)
            .toList();

    //- get population of a country : -> returns a long
    static List<Double> allCountriesPopulation = getList().stream()
            .map(Countries::getPopulation)
            .toList();

    //- get countries in continent : -> returns list of Country objects
    static List<Countries> getCountriesInContinent = getList().stream()
            .filter(countries -> countries.getContinent().equals("Asia") )
            .toList();

    //- get country neighbours :  -> returns list of Strings
    static List<List<String>> getCountriesNeighbours = getList().stream()
            .map(Countries::getNeighbour)
            .toList();


    public CountryService() {
    }

    public static List<Countries> getList() {
        //CountryReader.getCountriesList();
        return countriesList = CountryReader.getCountriesList();
    }

}
