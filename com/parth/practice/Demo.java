package com.parth.practice;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


class Demo{

    public static void main(String[] args)
    {
        String output  = getUrldata("https://www.punditas.com/");
        System.out.println(output);
    }

    private static String getUrldata(String mainUrl)
    {
        StringBuilder data = new StringBuilder();

        try
        {
            URL url = new URL(mainUrl); // creating a url object
            URLConnection urlConnection = url.openConnection();

            // wrapping the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            // reading from the urlconnection using the bufferedreader
            while ((line = bufferedReader.readLine()) != null)
            {
                data.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return data.toString();
    }
}

