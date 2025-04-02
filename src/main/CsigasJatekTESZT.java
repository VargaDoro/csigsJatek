
package main;


public class CsigasJatekTESZT {
    public static void main(String[] args) {
        //boolean jolValaszt = true;
        int index = CsigasJatek.index;
        teszt(CsigasJatek.index);
        
        try {
            CsigasJatek csj = new CsigasJatek();
            csj.fogadas();
            
            if (index<1 || index>3){
                System.out.println("Hibás választás! Csak 1, 2 vagy 3 lehet.");

            }
        } catch (Exception e) {
            System.out.println("Hiba történt: Hibás választás! Csak 1, 2 vagy 3 lehet." + e.getMessage());
        }
        
    }
    
    public static void teszt(int index){
        assert index>=1 && index<=3: "Hibás választás! Csak 1, 2 vagy 3 lehet.";

    }
}
