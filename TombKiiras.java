/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombkiiras;

import java.util.Scanner;

/**
 *
 * @author Robi
 */
public class TombKiiras {
public static void kiir(int[] tomb){
    for (int i = 0; i <tomb.length; i++) {
        System.out.print(String.format("%,3d",tomb[i])+" ");
    }
    System.out.println();
}
public static void tomb(int[] tomb){
    for (int i = 0; i <10; i++) {
            tomb[i] = (int) (Math.random()*200)-100;
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner be=new Scanner(System.in);
        System.out.println("Tömbkiírás metódussal");
        System.out.println("\n Készítette: Köbli Róbert\n");
        int tomb1[] = new int [10];
        int tomb2[] = new int [10];
        int tomb3[] = new int [10];
        
        tomb(tomb1);
        tomb(tomb2);
        tomb(tomb3);
        
        System.out.println("Az első tömb elemei:");
        kiir(tomb1);
        System.out.println("A második tömb elemei:");
        kiir(tomb2);
        System.out.println("A harmadik tömb elemei:");
        kiir(tomb3);
    }
    
}
