import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Jelolt> jeloltek = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("szavazatok.txt","rw");
            String sor = raf.readLine();

            while(sor != null){
                Jelolt egyJelolt = new Jelolt (sor.split(" "));
                jeloltek.add(egyJelolt);
                sor = raf.readLine();
            }

            raf.close();
        }
        catch( IOException e ) {
            System.err.println("Hiba");
        }

        // 2. feladat: Hány képviselőjelölt indult a helyhatósági választáson? (A helyhatósági választáson 92 képviselőjelölt indult.)
        System.out.println("A helyhatósági választáson " + jeloltek.size() + " képviselőjelölt indult.");

        // 3. feladat: Képviselőjelölt vezetékneve, utóneve, mennyi szavazat? Ha nincs ilyen jelölt: (Ilyen nevű képviselőjelölt nem szerepel a nyilvántartásban!)
        Scanner be = new Scanner(System.in);
        System.out.print("Vezetéknév: ");
        String veznev = be.next();
        System.out.print("Utónév: ");
        String utonev = be.next();

        for(int i = 0; i < jeloltek.size(); i++){
            if (jeloltek.get(i).getVeznev().equals(veznev))
                if (jeloltek.get(i).getUtonev().equals(utonev)) {
                    System.out.println(jeloltek.get(i).getVeznev() + " " + jeloltek.get(i).getUtonev() + ": " + jeloltek.get(i).getSzavazatok() + " szavazat");
            }
            else{
                    System.out.println("Ilyen nevű képviselőjelölt nem szerepel a nyilvántartásban!");
            }
        }
    }
}