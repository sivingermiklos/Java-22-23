import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Feladat> feladatok = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("felszam.txt", "r");

            String kerdes = raf.readLine();
            String valasz = raf.readLine();

            while (kerdes != null && valasz != null){
                Feladat egyFeladat = new Feladat(kerdes, valasz);
                feladatok.add(egyFeladat);

                kerdes = raf.readLine();
                valasz = raf.readLine();
            }

            raf.close();
            System.out.println("A feladatok száma: " + feladatok.size());
        }
        catch (IOException e) {
            System.err.println("Hiba");
        }
    }
}
