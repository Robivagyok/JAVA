/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldontes;

import java.util.Scanner;

/**
 *
 * @author Robi
 */
public class Eldontes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n ELDÖNTÉS TÉTELE\n");
        System.out.println("\n Készítette: Köbli Róbert\n");
        
        System.out.print("Hány elemű tömböt szeretne létrehozni? ");
        Scanner be=new Scanner(System.in);
        int elemSzam=be.nextInt();
        int[] szamok=new int[elemSzam];
        
        for (int i = 0; i < elemSzam; i++) {
            szamok[i]=(int) (Math.random()*100)-50;
        }
        
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
        boolean szerepelE=false;
        for (int i = 0; i <elemSzam; i++) {
            if(szamok[i]==0){
                szerepelE=true;
                break;
            }
        }
        if(szerepelE){
            System.out.println("\n A tömb tartalmaz nullát!");
        }
        else
            System.out.println("\n A tömb nem tartalmaz nullát!");
    }
    
}
