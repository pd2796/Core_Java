package com.parth.practice;

public class Byte {
public static void main(String[] a)
{
    byte ab = 126;
    System.out.println(ab);
    ab++;
    System.out.println(ab);
    ab++;
    System.out.println(ab); // looping back because byte is hold the value from -128 to 127
    ab++;
    System.out.println(ab);
}
}
