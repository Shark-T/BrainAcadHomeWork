package com.brainacad.c2_lab8.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by SHARK on 04.06.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        URL weather = new URL("http://api.openweathermap.org/data/2.5/weather?q=London");
        URLConnection yc = weather.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while((inputLine=in.readLine())!=null);
        System.out.println(inputLine);
        in.close();


    }
}

