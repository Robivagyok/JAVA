/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszegzes;

import java.util.Scanner;



/**
 *
 * @author Robi
 */
public class Osszegzes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner be=new Scanner(System.in);
       //Összegzés tétele
       //int tomb1[]=(11,22,33,44,55);
        
        
        System.out.print("Kérem adjon meg 5 számot 1 és 100 között!: ");
        int[] tomb1=new int[5];
        for (int i = 0; i < 5; i++) {
            tomb1[i]=be.nextInt();
        }
        
        
        int tomb2[]=new int[5];
        for (int i = 0; i < 5; i++) {
            tomb2[i]=(int)(Math.random()*99+1);
        }
        //tömb1
        int osszeg1=0;
        System.out.print(" A tomb1 elemei: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(String.format("%,2d",tomb1[i])+" ");
            osszeg1=osszeg1+tomb1[i];
        }
        //tömb2
        int osszeg2=0;
        System.out.print("\n A tomb2 elemei: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(String.format("%,2d",tomb2[i])+" ");
            osszeg2=osszeg2+tomb2[i];
        }
        System.out.println("\n \n A tömb1 elemeinek az összege: "+osszeg1);
        System.out.println("A tömb2 elemeinek az összege: "+osszeg2);
        System.out.println("\n \n A tömb1 elemeinek átlaga: "+osszeg1/tomb1.length);
        System.out.println("A tömb2 elemeinek átlaga: "+osszeg2/tomb2.length);
        System.out.println("\n Készítette: Köbli Róbert");
    }
    
}
