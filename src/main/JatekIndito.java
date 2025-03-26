package main;

public class JatekIndito {

    public static void main(String[] args) {
        Jatek csigas = new CsigasJatek();
        Jatek kitalalos = new KitalalosJatek();
        Jatek[] jatekok = {csigas, kitalalos, new Jatek()};
        
        for (Jatek jatek : jatekok) {
//            if (jatek instanceof KitalalosJatek) {
//
//                k.start();
//                ((KitalalosJatek) jatek).start();
//            }
            jatek.start();
        }
    }
}
