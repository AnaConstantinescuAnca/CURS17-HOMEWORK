package com.fasttrackit.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CountryReader {
    private final static List<Countries> countriesList = new ArrayList<>();

    private String pathfile;

    public static List<Countries> getCountriesList() {
        return countriesList;
    }

    public CountryReader(String pathfile) {
        this.pathfile = pathfile;
    }

    public String getPathfile() {
        return pathfile;
    }

    public static List<Countries> ReadFromFile(String pathfile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathfile));
        //String line = bufferedReader.readLine();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            countriesList.add(CountriesFromLine(line));
        }
        return countriesList;
    }


    private static Countries CountriesFromLine(String line) {
        String[] token = line.split(Pattern.quote("|"));
        if (isaBoolean(line)) {
            return new Countries(IdGenerate(), token[0], token[1], Double.parseDouble(token[2]), Double.parseDouble(token[3]),
                    token[4], null);

        }
        return new Countries(IdGenerate(), token[0], token[1], Double.parseDouble(token[2]), Double.parseDouble(token[3]),
                token[4], Neiborough(token[5]));
    }

    //verific daca ultimul caracter din line este |
    private static boolean isaBoolean(String line) {
        return line.endsWith("|");
    }

    private static List<String> Neiborough(String s) {
        String[] tokenNeiborough = s.split(Pattern.quote("~"));
        List<String> result = List.of(tokenNeiborough);
        return result;
    }

    private static int IdGenerate() {
        return countriesList.size() + 1;
    }

//    Stream<Countries> stream = countriesList.stream();
//    static List<String> allCountriesName = countriesList.stream()
//            .map(Countries::getName)
//            .toList();
//
}
