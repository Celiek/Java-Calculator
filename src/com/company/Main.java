package com.company;
import java.util.*;
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
        //dzielenie ciagu na kilka podznakow
        String[] zn1 = dzialanie.split("[\\+\\-\\/\\*]");

        //liczby zapisane w longu poniewaz moga miec dlugosc poand 2 miliardow1
        long znak1 = Long.parseLong(zn1[0]);
        long znak2 = Long.parseLong(zn1[1]);


        //jezeli nie wprowadzono prawidlowego znaku
        //ta czesc kodu przerywa wykonanie

        if(!znak_dzialania.find()){
            System.out.println("Nie znaleziono znaku dzialania");
            return;
        }

        if(dzialanie.contains("+")){
            System.out.println( znak1 + znak2);
        } else if(dzialanie.contains("-")){
            System.out.println( znak1 - znak2);
        } else if(dzialanie.contains("*")){
            System.out.println(znak1 * znak2);
        } else if(dzialanie.contains("/")){
            System.out.println(znak1 /znak2);
        } else {
            System.out.println("Cos poszlo nie tak");
        }

        scan.close();
    }
}
