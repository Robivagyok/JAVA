/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerulet;

import java.util.Scanner;

/**
 *
 * @author Robi
 */
public class Kerulet {
static int teglalapK(int teglalapA, int teglalapB) {
        return (teglalapA + teglalapB) * 2;
    }

    static double korSugar(int r) {
        return (2 * (r * Math.PI));
    }

    static int haromszogK(int haromszogA, int haromszogB, int haromszogC) {
        return haromszogA + haromszogB + haromszogC;
    }

    static int otszog(int otszogOldal) {
        return 5 * otszogOldal;
    }

    static int hatszog(int hatszogOldal) {
        return 6 * hatszogOldal;
    }

    public static void main(String[] args) {
        System.out.print("MENÜ + ALAKZATOK KERÜLETÉNEK SZÁMÍTÁSA\nKöbli Róbert 113C");
        Scanner be = new Scanner(System.in);
        char valasz;
        do {
            System.out.print("\nMilyen alakzat kerületére kíváncsi?\n1-téglalap\n2-kör\n3-háromszög\n4-szabályos ötszög\n5-szabályos hatszög");
            System.out.print("\nVálasz: ");
            int menupont = be.nextInt();
            while (menupont > 5 || menupont < 1) {
                System.out.print("Ilyen menüpont nincs, válasszon 1-től 5-ig!:");
                menupont = be.nextInt();
            }
            switch (menupont) {
                case 1:
                    System.out.println("TÉGLALAP");
                    System.out.print("Adja meg az 'a' oldalt!: ");
                    int tA = be.nextInt();
                    System.out.print("Adja meg a 'b' oldalt!: ");
                    int tB = be.nextInt();
                    System.out.println("A téglalap kerülete " + teglalapK(tA, tB) + " cm.");
                    break;
                case 2:
                    System.out.println("KÖR");
                    System.out.print("Adja meg a kör sugarát!: ");
                    int sugar = be.nextInt();
                    System.out.println("A kör területe " + korSugar(sugar) + "cm.");
                    break;
                case 3:
                    System.out.println("HÁROMSZÖG");
                    System.out.print("Adja meg az 'a' oldalt!: ");
                    int hszA = be.nextInt();
                    System.out.print("Adja meg a 'b' oldalt!: ");
                    int hszB = be.nextInt();
                    System.out.print("Adja meg a 'c' oldalt!: ");
                    int hszC = be.nextInt();
                    System.out.println("A háromszög kerülete " + haromszogK(hszA, hszB, hszC) + " cm.");
                    break;
                case 4:
                    System.out.println("SZABÁLYOS ÖTSZÖG");
                    System.out.print("Adja meg az ötszög oldalát!: ");
                    int oldal5 = be.nextInt();
                    System.out.println("Az ötszög kerülete " + otszog(oldal5) + " cm.");
                    break;
                case 5:
                    System.out.println("SZABÁLYOS HATSZÖG");
                    System.out.print("Adja meg a hatszög oldalát!: ");
                    int oldal6 = be.nextInt();
                    System.out.println("A hatszög kerülete " + hatszog(oldal6) + " cm.");
                    break;
                default:
                    break;
            }
            System.out.print("Szeretne mást is számolni? Írjon egy 'i'-t!: ");
            valasz = be.next().charAt(0);
        } while (valasz == 'i');
    }
}
