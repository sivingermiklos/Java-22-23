import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {

        RandomAccessFile raf;
        String sor;

        try {
            raf = new RandomAccessFile("novenyek.txt", "r");

            sor = raf.readLine();

            Noveny enMuskatlim = new Noveny(sor.split(", "));

            System.out.println(enMuskatlim.getNev());
            System.out.println(enMuskatlim.getSzin());
            System.out.println(enMuskatlim.getMagassag());
            System.out.println(enMuskatlim.isEveloE());

            raf.close();
        }
        catch (IOException e) {
            throw new RuntimeException("HIBA: " + e);
        }
    }
}