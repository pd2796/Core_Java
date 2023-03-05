package com.parth.practice;
import java.io.*;
public class BufferReder {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader ( new InputStreamReader (System.in));

        String name = reader.readLine();

        System.out.println(name);

    }
}
