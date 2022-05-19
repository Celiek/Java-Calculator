package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //inicjalizacaja podstawowych zmiennych
        Scanner scan = new Scanner(System.in);
        System.out.println("Wrowadz dzialanie");
        String dzialanie = scan.nextLine();

        //znak specjanly
        Pattern znak = Pattern.compile("([\\+\\-\\/\\*])");
        Matcher znak_dzialania = znak.matcher(dzialanie);

        //pierwsza liczba
        Pattern pierwsza_liczba = Pattern.compile("^(\\d+[\\+\\-\\*\\/]{1})");
        Matcher pierwsza  = pierwsza_liczba.matcher(dzialanie);

        //druga liczba
        Pattern druga_liczba = Pattern.compile("[0-9]+$");
        Matcher druga = druga_liczba.matcher(dzialanie);

        //debug stuff
        System.out.println("Znak specjalny " + znak_dzialania.find());
        System.out.println("Pierwsza liczba " + pierwsza.find());
        System.out.println("Druga liczba " + druga.find());

        Pattern test = Pattern.compile("([\\+\\-\\/\\*])|(^(\\d+[\\+\\-\\*\\/]{1}))|([0-9]+$)");
        Matcher matchtest = test.matcher("123+321");

        String[] znak_specjalny = dzialanie.split("[\\+\\-\\/\\*]" , 3);
        System.out.println("Znak specjalny" );

        for (int i = 0; i < znak_specjalny.length; i++) {
                System.out.println(znak_specjalny[i]);
        }

        List<String> tokens = new LinkedList<String>();

        while(matchtest.find()){
            String token = matchtest.group(1);
            tokens.add(token);
        }

        System.out.println(tokens);



        //jezeli nie wprowadzono prawidlowego znaku
        //ta czesc kodu przerywa wykonanie
        if(!znak_dzialania.find()){
            System.out.println("Nie znaleziono znaku dzialania");
            return;
        }

        String temp = znak.toString();

        switch (temp){
            case "+":
                    System.out.println( Integer.parseInt(String.valueOf(pierwsza_liczba))  + Integer.parseInt(String.valueOf(druga_liczba)));
                break;
            case "-":
                System.out.println( Integer.parseInt(String.valueOf(pierwsza_liczba))  - Integer.parseInt(String.valueOf(druga_liczba)));
                break;
            case "*":
                System.out.println( Integer.parseInt(String.valueOf(pierwsza_liczba))  * Integer.parseInt(String.valueOf(druga_liczba)));
                break;
            case "/":
                System.out.println( Integer.parseInt(String.valueOf(pierwsza_liczba))  / Integer.parseInt(String.valueOf(druga_liczba)));
                break;
            default:
                System.out.println("Cos poszlo nie tak");
                break;
        }

        scan.close();
    }
}
