import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tanc> tancok = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("tancrend.txt","r");
            String sor = raf.readLine();

            while(sor != null) {
                String[] tanc = new String[3];
                tanc[0] = sor;
                tanc[1] = raf.readLine();
                tanc[2] = raf.readLine();

                Tanc egyTanc = new Tanc(tanc);
                tancok.add(egyTanc);
                sor = raf.readLine();
                System.out.println(egyTanc);
            }
            System.out.println("Táncok száma: " + tancok.size());

            raf.close();
        }
        catch( IOException e ) {
            System.err.println("Hiba");
        }
    }
}