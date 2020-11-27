/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombmuveletek;

import java.util.Scanner;

/**
 *
 * @author Robi
 */
public class TombMuveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner be=new Scanner(System.in);
	int osszeg1=0;
        int osszeg2=0;
        
        System.out.println("\tTÖMBŰVELETEK\n");
        System.out.println("\n Készítette: Köbli Róbert\n");
        System.out.print("Hány eleműek legyenek a tömbök?");
        int n=be.nextInt();
        
        
        
        int tomb1[]=new int[n];
        int tomb2[]=new int[n];
        
        
        for (int i = 0; i < n; i++) {
            tomb1[i]=(int) (Math.random()*999)+1;
	    osszeg1=osszeg1+tomb1[i];
            tomb2[i]=(int)(Math.random()*999)+1;
            osszeg2=osszeg2+tomb2[i];
        }
        System.out.print("A tömbök elemei: \n");
        for (int i = 0; i < n; i++) {
            int sorOsszeg=0;
            sorOsszeg=tomb1[i]+tomb2[i];
            System.out.print(i+1+".: ");
            System.out.print(String.format("%,3d",tomb1[i])+" + ");
            System.out.print(String.format("%,3d",tomb2[i])+" = ");
            System.out.print(String.format("%,5d",sorOsszeg));
            System.out.println("");
        }
        System.out.println("\nAz első tömb elemeinek összege: "+String.format("%,5d",osszeg1));
        System.out.println("A második tömb elemeinek összege: "+String.format("%,5d",osszeg2));
        
    }
    
}
