package metodusgyak1129;

public class MetodusGyak1129 {

    // -------- 1. FELADAT --------
    public static boolean szamjegyekParosE(int szam){
        String szamok = Integer.toString(szam);
        String[] szamokLista = szamok.split("");
        int elsoSzam = Integer.parseInt(szamokLista[0]);
        int masodikSzam = Integer.parseInt(szamokLista[1]);
        
        if (elsoSzam % 2 == 0 && masodikSzam % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    // -------- 2. FELADAT --------
    public static boolean szamKozep(int szam1, int szam2, int szam3){
        int kozepSzam = 0;
        int legkisebbSzam = Math.min(Math.min(szam1, szam2),szam3);
        int legnagyobbSzam = Math.max(Math.max(szam1, szam2),szam3); ;
        
        if (legkisebbSzam != szam1 && legnagyobbSzam != szam1){
            kozepSzam = szam1;
        }
        else if (legkisebbSzam != szam2 && legnagyobbSzam != szam2){
            kozepSzam = szam2;
        }
        else{
            kozepSzam = szam3;
        }
        
        return (kozepSzam - legkisebbSzam == legnagyobbSzam - kozepSzam);
    }
    
    // -------- 3. FELADAT --------
    public static void matrix(int n){
        for(int i = 0; i < n; i++){ //oszlop
            for(int j = 0; j < n; j++){ //sor
                System.out.print(Math.round(Math.random())+ "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

      // -------- 1. FELADAT --------
      int egeszSzam = 68;
      System.out.println(szamjegyekParosE(egeszSzam));

      // -------- 2. FELADAT --------
      int szam1 = 2;
      int szam2 = 5;
      int szam3 = 8;
      System.out.println(szamKozep(szam1,szam2,szam3));

      // -------- 3. FELADAT --------
      int n = 5;
      matrix(n);
    }
}