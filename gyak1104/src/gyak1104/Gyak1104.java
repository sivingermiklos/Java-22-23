package gyak1104;

import java.util.Scanner;

/**
 *
 * @author veejuu
 */
public class Gyak1104 {
    
    // 1. feladat
    public static double atlag(int elsoSzam, int masodikSzam) {

        double atlag = (elsoSzam + masodikSzam) / 2.0;
        return atlag;

    }
    
    
    // 1.5. feladat
    public static void feladat(){
        System.out.println("********************");
        System.out.println("*     Feladat      *");
        System.out.println("********************");
    }

    
    // 2. feladat
    public static int randomSzam(int felso,  int also){
        
        int randomSzam;
        randomSzam = (int)(Math.random()*(felso-also+1))+also;
 
        return randomSzam;
    }
    
    
    // 4. feladat
    public static double gulaTerfogat(double oldalAlap, double oldalMagassag){
        // (a*b)*magasság / 3;
        double gulaTerfogat = oldalAlap * oldalAlap * oldalMagassag / 3;
        
        return gulaTerfogat;
    }    
    
    // MAIN
    public static void main(String[] args) {
        
        Scanner szamBekeres = new Scanner(System.in);

        // ---------- 1. FELADAT ---------- (két szám átlaga)
        feladat();
        
        // A két szám bekérése
        System.out.print("Elso szam: ");
        int elsoSzam = szamBekeres.nextInt();
        System.out.print("Masodik szam: ");
        int masodikSzam = szamBekeres.nextInt();

        // A két szám átlaga
        System.out.println("A ket szam atlaga: " + atlag(elsoSzam, masodikSzam));
        
        
        // ---------- 2. FELADAT ---------- (random szám generálása bekért tartományból)
        feladat();
        
        // A két határ bekérése
        System.out.print("Felso hatar: ");
        int felsoHatar = szamBekeres.nextInt();
        System.out.print("Also hatar: ");
        int alsoHatar = szamBekeres.nextInt();
        
        if (felsoHatar < alsoHatar){
            System.out.println(randomSzam(felsoHatar,alsoHatar));
        }
        else if(felsoHatar > alsoHatar){
            System.out.println(randomSzam(alsoHatar,felsoHatar));
        }
        else{
            System.out.println("A ket hatar egyenlo, ezert nem jo. :(");
        }
        
        
        // ---------- 3. FELADAT ---------- (tömb feltöltése random számokkal)
        feladat();

        // Lista deklarálása
        int[] randomSzamLista = new int[20];

        // Lista feltöltése random számokkal
        for (int i = 0; i < 20; i++){
            randomSzamLista[i] = randomSzam(felsoHatar,alsoHatar);
        }

        // Ellenőrző print
        for (int i = 0; i < 20; i++){
            System.out.print(randomSzamLista[i] + " ");
        }
        
        
        // ---------- 4. FELADAT ---------- (négyzet alapú gúla térfogata)
        
        System.out.print("\nGula alapja: ");
        double oa = szamBekeres.nextDouble();
        System.out.print("Gula magassaga: ");
        double om = szamBekeres.nextDouble();
        
        System.out.println("A negyzet alapu gula terfogata: "+gulaTerfogat(oa,om));
    } 
}
