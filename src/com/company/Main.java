package com.company;

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
        //Pattern znak = Pattern.compile("([\\+\\-\\/\\*])");
        //Matcher znak_dzialania = znak.matcher(dzialanie);

        //pierwsza liczba
        //Pattern pierwsza_liczba = Pattern.compile("^(\\d+[\\+\\-\\*\\/]{1})");
        //Matcher pierwsza  = pierwsza_liczba.matcher(dzialanie);

        //druga liczba
        //Pattern druga_liczba = Pattern.compile("[0-9]+$");
        //Matcher druga = druga_liczba.matcher(dzialanie);

        //debug stuff
        String[] zn1 = dzialanie.split("([\\+\\-\\/\\*])");

        try{
            int znak1 = Integer.parseInt(String.valueOf(dzialanie.split("(\\d+[\\+\\-\\*\\/]{1})")));
            System.out.println("pierwsza liczba" + znak1);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }

        try{
            int znak2 = Integer.parseInt(String.valueOf(dzialanie.split("[0-9]+$")));
            System.out.println("Druga liczba " + znak2);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }

//        System.out.println("znak dzialania " + zn1[0]);
//        System.out.println("pierwsza liczba " + znak1);
//        System.out.println("druga liczba " + znak2);




        //jezeli nie wprowadzono prawidlowego znaku
        //ta czesc kodu przerywa wykonanie
//        if(!znak_dzialania.find()){
//            System.out.println("Nie znaleziono znaku dzialania");
//            return;
//        }
        String temp = zn1[0];

//        switch (temp){
//            case "+":
//                    System.out.println( znak1 + znak2);
//                break;
//            case "-":
//                System.out.println( znak1 - znak2);
//                break;
//            case "*":
//                System.out.println( znak1 * znak2);
//                break;
//            case "/":
//                System.out.println( znak1 / znak2);
//                break;
//            default:
//                System.out.println("Cos poszlo nie tak");
//                break;
//        }

        scan.close();
    }
}
