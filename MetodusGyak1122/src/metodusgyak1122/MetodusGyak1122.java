package metodusgyak1122;

import java.util.Scanner;

public class MetodusGyak1122 {
    // 1. FELADAT: Három szám közül visszaadja a legkisebbet.
    public static double legkisebb(int elsoSzam, int masodikSzam, int harmadikSzam){
        int min = Math.min(elsoSzam,masodikSzam);
        
        if (min < harmadikSzam){
            min = min;
        }
        else{
            min = harmadikSzam;
        }

        return min;
    }

    // 2. FELADAT: Visszaadja egy string középső karaterét. (1 vagy 2 középső karakter lehet)
    public static String kozepsoKarakter(String szo){
        int poz;
        int hossz;
        
        if (szo.length() % 2 == 0){
            poz = szo.length() / 2 - 1;
            hossz = 2;
        }
        else{
            poz = szo.length() / 2;
            hossz = 1;
        }
        
        return(szo.substring(poz, poz + hossz));
    }

    // 3. FELADAT: Visszaadja egy string magánhangzóinak számát.
    public static int maganhangzoSzam(String mondat){
        int maganhangzoCount = 0;

        for(int i = 0; i < mondat.length(); i++) {
            if(mondat.charAt(i) == 'a' || mondat.charAt(i) == 'e'||
               mondat.charAt(i) == 'i' || mondat.charAt(i) == 'o' ||
               mondat.charAt(i) == 'u' || mondat.charAt(i) == 'A'||
               mondat.charAt(i) == 'E' || mondat.charAt(i) == 'I' ||
               mondat.charAt(i) == 'O' || mondat.charAt(i) == 'U'){
                maganhangzoCount++;
            }
        }

        return maganhangzoCount;
    }

    // 4. FELADAT: Visszaadja hány szó van egy stringben.
    public static int szoSzam(String string){
        int szoCount = 1;

        for (int i = 0; i < string.length() - 1; i++){
            if ((string.charAt(i) == ' ') && (string.charAt(i + 1) != ' ')){
                szoCount++;
            }
        }
        
        return szoCount;
    }


    // 5. FELADAT: Visszaadja, hogy egy string érvényes jelszó-e (min 10 hosszú betű és számjegy / min 2 számjegy)
    public static boolean jelszoEllenorzes(String jelszo){
        int betuCount = 0;
        int szamCount = 0;

        if (jelszo.length() < 10){
            return false;
        }

        for (int i = 0; i < jelszo.length(); i++){

            if (Character.isDigit(jelszo.charAt(i))){
                szamCount++;
            }
            else if (Character.isLetter(jelszo.charAt(i))){
                betuCount++;
            }
            else {
                return false;
            }
        }
        
        return (betuCount >= 8 && szamCount >= 2);
    }


    // 6. FELADAT: A 3 kapott paraméterről eldönti, hogy növekvő sorban vannak-e
    public static boolean novekvoE(int elso, int masodik, int harmadik){
        return(elso < masodik && masodik < harmadik);
    }


    // 7. FELADAT: Visszaadja egy integer szám számjegyeinek összegét
    public static int szamjegyOsszeg(int szam){
        int osszeg = 0;
        
        while (szam != 0){
        osszeg += szam%10;
        szam = szam/10;
        }
        
        return osszeg;
    }



    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);

        // ---------- 1. FELADAT ----------
        int elsoSzam, masodikSzam, harmadikSzam;

        System.out.print("Elso szam: "); 
        elsoSzam = bill.nextInt();
        System.out.print("Masodik szam: "); 
        masodikSzam = bill.nextInt();
        System.out.print("Harmadik szam: "); 
        harmadikSzam = bill.nextInt();
        bill.nextLine();

        System.out.println(legkisebb(elsoSzam,masodikSzam,harmadikSzam));

        // ---------- 2. FELADAT ----------
        System.out.print("Adj meg egy szot: ");
        String szo = bill.nextLine();
        System.out.println(kozepsoKarakter(szo));

        // ---------- 3. FELADAT ----------
        System.out.print("Adj meg egy mondatot: ");
        String mondat = bill.nextLine();
        System.out.println(maganhangzoSzam(mondat));

        // ---------- 4. FELADAT ----------
        System.out.print("Adj meg megegy mondatot: ");
        String string = bill.nextLine();
        System.out.println(szoSzam(string));

        // ---------- 5. FELADAT ----------
        System.out.print("Adj meg egy jelszot: ");
        String jelszo = bill.nextLine();
        System.out.println(jelszoEllenorzes(jelszo));

        // ---------- 6. FELADAT ----------
        System.out.println(novekvoE(elsoSzam,masodikSzam,harmadikSzam));

        // ---------- 7. FELADAT ----------
        System.out.print("Adj meg egy szamot: ");
        int szam = bill.nextInt();
        System.out.println(szamjegyOsszeg(szam));

    }
}

