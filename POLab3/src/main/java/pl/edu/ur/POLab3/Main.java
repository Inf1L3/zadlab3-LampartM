/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        
        int a=1;
        
        
        while(a!=0){
        System.out.println("Podaj numer zadania(1,2,3,4,5). Podanie 0 konczy dzialanie programu");    
        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();
        
        switch(a){
            case 1: zadania.zad1(); break;
            case 2: zadania.zad2(); break;
            case 3: zadania.zad3(); break;
            case 4: zadania.zad4(); break;
            case 5: zadania.zad5(); break;
        }
        }
    }
    
}
