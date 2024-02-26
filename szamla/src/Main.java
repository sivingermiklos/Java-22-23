import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Beszelgetes> beszelgetesek = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("hivasok.txt","r");
            String sor;
            String telefonszam;
            int i = 0;
            do{
                sor = raf.readLine();
                telefonszam = raf.readLine();

                if(sor != null && telefonszam != null){
                    Beszelgetes egyBeszelgetes = new Beszelgetes(sor, telefonszam);
                    beszelgetesek.add(egyBeszelgetes);
                    System.out.println(beszelgetesek.get(i).toString());
                }
                i++;
            } while(sor != null);

            System.out.println("Beszélgetések száma: " + beszelgetesek.size());
            raf.close();
        }
        catch( IOException e ) {
            System.err.println("Hiba");
        }
    }
}