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
    public static void rendez(int[] tomb){
    for (int i = 0; i < 10-1; i++) {
            for (int j = 0; j < 10-i-1; j++) {
                if (tomb[j]>tomb[j+1]){
                    int temp=tomb[j];
                    tomb[j]=tomb[j+1];
                    tomb[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(tomb[i]+" ");
        }
}
    
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
public static void elvalaszto(){
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");    
        }
    
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
        
        System.out.println("\nAz első tömb elemei:");
        kiir(tomb1);
        
        System.out.println("\nA második tömb elemei:");
        kiir(tomb2);
        
        System.out.println("\nA harmadik tömb elemei:");
        kiir(tomb3);
        
        System.out.println("\nAz első tömb rendezve:");
        rendez(tomb1);
        
        System.out.println("\nA második tömb rendezve:");
        rendez(tomb2);
        
        System.out.println("\nA harmadik tömb rendezve:");
        rendez(tomb3);
        
    }
    
}
