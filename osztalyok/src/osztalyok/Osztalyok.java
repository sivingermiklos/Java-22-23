package osztalyok;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Osztalyok {
    public static void main(String[] args) {

        RandomAccessFile raf;
        String sor;

        Kutya buksiKutya = new Kutya("Buksi","tacskó","barna",5);
        Kutya bodriKutya = new Kutya("Bodri","puli","fekete",8);
        System.out.println(buksiKutya.getFajta());
        buksiKutya.ugat();

        try {
            raf = new RandomAccessFile("kutyak.txt", "rw");

            sor = raf.readLine();
            String[] adatok = sor.split(", ");

            Kutya cezarKutya = new Kutya(adatok[0], adatok[1], adatok[2], Integer.parseInt(adatok[3]));

            cezarKutya.ugat();

            raf.close();
        }
        catch (IOException e) {
            throw new RuntimeException("HIBA: " + e);
        }
    }
}