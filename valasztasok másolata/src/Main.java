import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Jelolt> jeloltek = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("szavazatok.txt","rw");
            String osszes = raf.readLine();
            String sor = raf.readLine();
            System.out.println(osszes);

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

    }
}