package main;

import java.util.Random;

public class CsigasJatek extends Jatek{
    private static final Random RND = new Random();
//    @Override
//    void start(){
//        System.out.println("Csigás indúl");
//    };
    private Csiga[] csigak;
    
    public void csigakLetrehozasa(){
        csigak[0] = new Csiga("piros");
        csigak[1] = new Csiga("zold");
        csigak[2] = new Csiga("kek");
    } 
    
    public Csiga csigagyorsitas(){
        Csiga valasztott = null;
        int eselySzam = RND.nextInt(0, 100);
        boolean esely = false;
        if (eselySzam < 20) {
            esely = true;
            int csigaSzam = RND.nextInt(0, csigak.length+1);
            valasztott = csigak[csigaSzam];
        }
        return valasztott;
    }
    
    public void verseny(){
        
    }
}
