import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Zene> szamok = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("musor.txt", "r");
            raf.readLine();

            String sor = raf.readLine();
            while (sor != null){
                szamok.add(new Zene(sor.split(" ")));
                sor = raf.readLine();
            }
        }
        catch (IOException e){
            System.err.println("Hiba");
        }

        for (int i = 0; i < szamok.size(); i++){
            System.out.println(szamok.get(i));
        }
    }
}