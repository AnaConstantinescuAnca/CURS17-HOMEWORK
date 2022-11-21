package com.fasttrackit.homework;

import java.io.IOException;
import java.util.List;


public class Main {
    private static String pathFile = "files/Countries2.txt";

    public static void main(String[] args) throws IOException {
        List<Countries> list = CountryReader.ReadFromFile(pathFile);

        //list all countries:  -> returns a list of country objects
        System.out.println(CountryService.getList());

        //- list all country names :  -> returns a list of strings
        System.out.println(CountryService.allCountriesName);

        //- get capital of a country :  -> returns a string
        System.out.println(CountryService.allCountriesCapital);

        //- get population of a country : -> returns a long
        System.out.println(CountryService.allCountriesPopulation);

        //- get countries in continent : -> returns list of Country objects
        System.out.println(CountryService.getCountriesInContinent);

        //- get country neighbours :  -> returns list of Strings
        System.out.println(CountryService.getCountriesNeighbours);

    }
}
