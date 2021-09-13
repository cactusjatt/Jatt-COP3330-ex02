/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print( "What is the input string? " );
        String st;
        st = in.nextLine();
        System.out.println(st + " has " + st.length() + " characters.");

        in.close();
    }
}