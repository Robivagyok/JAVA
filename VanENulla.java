/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vanenulla;

/**
 *
 * @author Robi
 */
public class VanENulla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n ELDÖNTÉS\n");
        System.out.println("\n Készítette: Köbli Róbert\n");
        
       int szam = (int) (Math.random()*10)+10;
        int tombNegativ[] = new int[szam*2];
        int k = 0;
        boolean szerepelE1 = false;
        boolean szerepelE2 = false;
        int tomb1[] = new int[szam];
        int tomb2[] = new int[szam];
        for(int i =0;i<szam;i++){
            tomb1[i] = (int) (Math.random()*200)-100;
            tomb2[i] = (int) (Math.random()*200)-100;
            if(tomb1[i]<0){
                tombNegativ[k] = tomb1[i];
                k++;
            }
            if(tomb2[i]<0){
                tombNegativ[k] = tomb2[i];
                k++;
            }
            if(tomb1[i] == 0){
                szerepelE1 = true;
            }
            if(tomb2[i] == 0){
                szerepelE2 = true;
            }
           
        }
        for(int i =0;i<szam;i++){            
            System.out.print(String.format("%,3d",tomb1[i])+" ");
        }
        System.out.println("");
        for(int i =0;i<szam;i++){            
            System.out.print(String.format("%,3d",tomb2[i])+" ");
        }
        System.out.println("");
        int osszegNeg= 0;
        for(int i =0;i<k;i++){
            osszegNeg+=tombNegativ[i];
            System.out.print(String.format("%,3d",tombNegativ[i])+" ");
        }
        System.out.println("\nEnnyi negatív szám volt: "+k);
        System.out.println("Ennyi a negativ tömb elemeinek az összege: "+osszegNeg);
        System.out.println("Ennyi a negativ tömb elemeinek az átlaga: "+(double)osszegNeg/k);
        if(szerepelE1 == true){
            System.out.println("Az első tömben szerepel nulla");
        }
        if(szerepelE2 == true){
            System.out.println("Az második tömben szerepel nulla");
    }
    
    }
}
