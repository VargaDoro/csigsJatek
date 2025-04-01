package main;

import java.util.Random;
import java.util.Scanner;

public class CsigasJatek extends Jatek{
    Scanner SCR = new Scanner(System.in);
    private static final Random RND = new Random();
//    @Override
//    void start(){
//        System.out.println("Csigás indúl");
//    };
    private Csiga[] csigak;
    
    public CsigasJatek() {
        csigak = new Csiga[3];
        csigakLetrehozasa();
    }
    
    public void csigakLetrehozasa(){
        csigak[0] = new Csiga("piros");
        csigak[1] = new Csiga("zold");
        csigak[2] = new Csiga("kek");
    } 
    
    public Csiga csigagyorsitas() {
        Csiga valasztott = null;
        int eselySzam = RND.nextInt(0, 100); // Véletlenszerű esély
        boolean esely = false;

        if (eselySzam < 20) {
            esely = true;
            int csigaSzam = RND.nextInt(0, csigak.length);
            valasztott = csigak[csigaSzam];
            valasztott.setGyorsito(true);
        }
        return valasztott;
    }
    
    public void verseny() {
        for (Csiga csiga : csigak) {
            for (int i = 0; i < 5; i++) { 
                csiga.megy();
            }
            System.out.println(csiga.getSzin() + " csiga (" + csiga.getABRA() + ") útja: " + csiga.getMegtettUt());
        }
    }
    
    public void fogadas() {
        System.out.println("Melyik csigára fogadsz? (piros, zold, kek): ");
        String fogadottCsiga = SCR.nextLine().toLowerCase();

        
        csigagyorsitas();
        verseny();
        
        Csiga nyertes = csigak[0];
        for (Csiga csiga : csigak) {
            if (csiga.getMegtettUt().length() > nyertes.getMegtettUt().length()) {
                nyertes = csiga;
            }
        }
        System.out.println("A nyertes csiga: " + nyertes.getSzin() + " (" + nyertes.getABRA() + ")");
        if (nyertes.getSzin().equals(fogadottCsiga)) {
            System.out.println("Gratulálunk, nyertél");
        } else {
            System.out.println("Sajnáljuk, a " + nyertes.getSzin()+" nyert");
        }
    }

}
