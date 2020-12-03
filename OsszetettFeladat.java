/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszetettfeladat;

import java.util.Scanner;

/**
 *
 * @author Robi
 */
public class OsszetettFeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n ÖSSZETETT FELADATSOR \n");
        System.out.println("\n Készítette: Köbli Róbert \n");
        
        Scanner be=new Scanner(System.in);
        char valasz=0;
        do{
        //1. Hozz létre két tömböt: szamok1, szamok2 néven!
        //2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
        int elemSzam=(int)(Math.random()*10)+30;
        int szamok1[]=new int[elemSzam];
        int szamok2[]=new int[elemSzam];
        
        //3. Az elemek a -50 és +50 értéktartományba essenek.
        for (int i = 0; i < elemSzam; i++) {
            szamok1[i]=(int)(Math.random()*-50)+50;
            szamok2[i]=(int)(Math.random()*-50)+50;
        }
        //4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
        System.out.println("\n A szamok1 tömb elemei: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.println(String.format("%,4d", szamok1[i])+" ");
        }
        System.out.println("\n A szamok2 tömb elemei: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.println(String.format("%,4d", szamok2[i])+" ");
        }
        //5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe, majd írasd ki sorbarendezve.
        int ujTomb[]=new int[elemSzam];
        int ujTombDb=0;
        for (int i = 0; i < elemSzam; i++) {
            if(szamok1[i]%5==0){
                ujTomb[ujTombDb++]=szamok1[i];
            }
            if(szamok2[i]%5==0){
                ujTomb[ujTombDb++]=szamok2[i];
            }
        }
        System.out.println("\n Az ujTomb elemei: \n");
        for (int i = 0; i < ujTombDb; i++) {
            System.out.println(String.format("%,4d", ujTomb[i])+" ");
        }
        
        //6. Írasd ki a legkisebb és legnagyobb számot az ujTomb-ből.
        int legnagyobb = ujTomb[0];
        int legkisebb = ujTomb[0];
        
        for (int i = 0; i < ujTombDb; i++) {
            if (ujTomb[i] > legnagyobb) {
                legnagyobb = ujTomb[i];
            }
        }
        System.out.println("Az ujTomb legnagyobb száma: "+legnagyobb);
        
        for (int i = 0; i < ujTombDb; i++) {
            if (ujTomb[i] < legkisebb) {
                legkisebb = ujTomb[i];
            }
        } 
        System.out.println("Az ujTomb legkisebb száma: "+legkisebb);
        
        //7. Írasd ki, többszöröse-e a legnagyobb szám a legkisebbnek?
         if (legnagyobb % legkisebb == 0) {
            System.out.println("\n Az ujTomb legnagyobb eleme a legkisebb többszöröse");
        }
        else {
            System.out.println("\n Az ujTomb legnagyobb eleme nem többszöröse a legkisebbnek");
        }
        //8. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
            for (int i = 0; i < ujTombDb; i++) {
                if(ujTomb[i]==0) System.out.println("Az ujTomb tartalmaz 0-t");
                else System.out.println("Az ujTomb nem tartalmaz 0-t");
                break;
            }
       //9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
            System.out.println("Újra lefuttatja a programot? i/n: ");
            valasz=be.next().charAt(0);
        }while((valasz=='i') || (valasz=='I'));
    }
    
}
