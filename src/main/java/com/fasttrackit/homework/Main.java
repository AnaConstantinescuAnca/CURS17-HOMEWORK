package com.fasttrackit.homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    private static String pathFile = "files/Countries2.txt";
    private static List<Countries> list = new ArrayList<>();


    public static void main(String[] args) throws IOException {
       List<Countries> list = CountryReader.ReadFromFile(pathFile);
        System.out.println(list.toString());

        //afisez numele tuturor tarilor
        CountryService countryService = new CountryService();
        list.stream().map(Countries::getName);
        list.stream().toList();
     System.out.println(list.stream().toList());
        }




}
