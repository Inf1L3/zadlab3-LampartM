/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Maciek
 */
public class zadania {

    static void zad1() {
        int a, b, c, w1, w2, w3;
        System.out.println("Podaj a:");
        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();
        b = a;
        c = a;

        w1 = a >> 1;
        System.out.println("a >> 1 = " + w1);
        w2 = b << 1;
        System.out.println("a << 1 = " + w2);
        w3 = c >>> 3;
        System.out.println("a >>> 3 = " + w3);

    }

    static void zad2() {
        int a, b;

        System.out.println("Podaj dwie liczby:");
        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();
        b = odczyt.nextInt();

        System.out.println("Działanie bramki NOT:");
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("b >= a");
        }
        if (!(a > b)) {
            System.out.println("!b > a");
        } else {
            System.out.println("!a >=b");
        }

        System.out.println("Dzialanie bramki XOR:");
        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("Przynajmniej jedna jest parzysta.");
        } else {
            System.out.println("Zadna nie jest parzysta");
        }

        System.out.println("Dzialanie bramki XOR i NOT:");
        if (!(a % 2 == 0 || b % 2 == 0)) {
            System.out.println("Maksymalnie jedna parzysta");
        } else {
            System.out.println("Obie sa parzyste");
        }
    }

    static void zad3() {
        System.out.println("-----ZADANIE 2.2-----");

        String s1 = "Przykladowy tekst";
        String s3 = "PRZYKLADOWY TEKST";
        String s5 = "tekst";
        String s6 = "    Przykladowy Tekst     ";

        //toCharArray
        System.out.println(s1.toCharArray());//String s1 zamieniany jest na tablice znaków 
        //getBytes 
        byte[] s2;
        s2 = s1.getBytes();//Wyświetla bajt kazdego znaku 
        for (int i = 0; i < s2.length; i++) {
            System.out.print(i + "." + s2[i] + " ");
        }
        System.out.print("\n");
        //boolean equals
        boolean row;
        row = s1.equals(s3); //Sprawdza czy s1 s2 są równe zwracajac uwage na wielkosc znakow i zwraca true lub false
        System.out.println(row);
        row = s1.equalsIgnoreCase(s3);//Sprawdza czy s1 s2 są równe ingorujac wielkosc znakow i zwraca true lub false 
        System.out.println(row);
        //compareTo
        System.out.println(s1.compareTo(s3));//porownuje s1 do s2 i gdy znak sie rozni dodaje 1 
        System.out.println(s1.compareToIgnoreCase(s3));//Porwonuje s1 do s2 ignorujac znaki,gdy znak sie rozni dodaje 1 
        //indexOf
        System.out.println(s1.indexOf('m'));//Podaje numer znaku pierwszego wystapienia zaczynajac od 0 
        System.out.println(s1.indexOf('m', 1));//Podaje numer znaku pierwszego wystapienia zaczynajac od 0 od zadanego indexu
        //lastindexOf
        System.out.println(s1.lastIndexOf('a'));//Podaje numer znaku ostatniego wystapienia 
        System.out.println(s1.lastIndexOf('a', 3));//Podaje numer znaku ostatniego wystapienia od zadanego indexu
        //subString
        System.out.println(s5.substring(3));//wyswielta czesc string od podanego indexu
        System.out.println(s5.substring(1, 3));//wyswielta czesc string od indexu startowego do indexu koncowego
        //replace
        System.out.println(s1.replace('i', 'c'));//zamienia podany znak na inny ktory rowniez podajemy
        //trim
        System.out.println("- trim():\nprzed: " + s6);
        System.out.println("po: " + s6.trim());//usuwa nadmiar spacji przed i za lancuchem znakow
        //toLowerCase
        System.out.println(s1.toLowerCase());
        //toUpperCase
        System.out.println(s1.toUpperCase());
        //split
        String[] s1parts = s1.split("og");//Dzieli String na 2 czesci
        String p1 = s1parts[0];//czesc przed zadanymi znakami
        String p2 = s1parts[1];//czesc po zadanych znakach
        System.out.println(p1);
        System.out.println(p2);
    }

    static void zad4() {

        int p, w, wynik;
        wynik = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj podstawe: ");
        p = sc.nextInt();
        System.out.print("Podaj wykladnik: ");
        w = sc.nextInt();

        System.out.println("Rekurencyjnie:");
        System.out.println(p + "^" + w + " = " + potega(p, w));

        System.out.println("Petla for:");
        for (int i = 1; i <= w; i++) {
            wynik = wynik * p;
        }
        System.out.println(wynik);
    }

    private static int potega(int p, int w) {
        if (w == 0) {
            return 1;
        }
        return p * potega(p, --w);
    }

    static void zad5() {
        System.out.println("Podaj n ciagu");
        Scanner fib = new Scanner(System.in);
        int n = fib.nextInt();
        System.out.println("Suma ciagu: " + ciag(n));
    }

    public static int ciag(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return ciag(n - 1) + ciag(n - 2);
        }
    }

}
