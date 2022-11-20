package com.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountryService {

    private static final List<Countries> countries = new ArrayList<>();


    public CountryService() {
    }

    public List<Countries> getCountries() {
        return countries;
    }

    public static List<String> getAllCountriesNames() {

        return countries.stream()
                .map(countries -> countries.getName())
                .toList();
    }



}
