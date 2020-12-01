/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorbarendezes;

import java.util.Scanner;

/**
 *
 * @author Robi
 */
public class SorbaRendezes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n SORBARENDEZÉS TÉTELE (buborékos módszer)\n");
        System.out.println("\n Készítette: Köbli Róbert\n");
        
        System.out.print("Hány elemű tömböt szeretne létrehozni?");
        Scanner be=new Scanner(System.in);
        int elemSzam=be.nextInt();
        int [] szamok=new int[elemSzam];
        
        //tömb feltöltése - elemek random értéket kapnak
        for (int i = 0; i < elemSzam; i++) {
            szamok[i]=(int)(Math.random()*50)-50;
        }
        
        //tömb kiíratása
        System.out.println("\n Tömbünk elemei: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
        
        //tömb sorbarendezett kiíratása: buborékos rendezés
        for (int i = 0; i < elemSzam-1; i++) {
            for (int j = 0; j < elemSzam-i-1; j++) {
                if (szamok[j]>szamok[j+1]){
                    int temp=szamok[j];
                    szamok[j]=szamok[j+1];
                    szamok[j+1]=temp;
                }
            }
        }
        System.out.println("\n Rendezett tömbünk: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
    }
    
}
