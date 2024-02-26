import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Igeny> igenyek = new ArrayList<>();
        Scanner bill = new Scanner(System.in);

        try {
            RandomAccessFile raf = new RandomAccessFile("igeny.txt","r");
            int szintekSzama = Integer.parseInt(raf.readLine());
            int csapatokSzama = Integer.parseInt(raf.readLine());
            int igenyekSzama = Integer.parseInt(raf.readLine());
            String sor = raf.readLine();
            System.out.println("Szintek száma: " + szintekSzama);
            System.out.println("Csapatok száma: " + csapatokSzama);
            System.out.println("Igények száma: " + igenyekSzama);

            while(sor != null){
                String[] string = sor.split(" ");
                int[] integer = new int[string.length];

                for(int i = 0; i < string.length; i++){
                    integer[i] = Integer.parseInt(string[i]);
                }
                Igeny egyIgeny = new Igeny (integer);
                igenyek.add(egyIgeny);
                sor = raf.readLine();
            }

            raf.close();

            for(int i = 0; i < igenyek.size(); i++){
                System.out.println(igenyek.get(i));
            }

            // 2. feladat
            System.out.print("2. feladat: Kérem adja meg, hogy melyik szinten áll a lift: ");
            int indulasiHely = bill.nextInt();

            // 3. feladat
            System.out.println("3. feladat: A lift a " + igenyek.get(igenyek.size()-1).getHova() + ". szinten áll az utolsó igény teljesítése után.");

            // 4. feladat
            int min = igenyek.get(0).getHonnan();
            int max = igenyek.get(0).getHonnan();

            for (int i = 0; i < igenyek.size(); i++){
                if (igenyek.get(i).getHova() > max){
                    max = igenyek.get(i).getHova();
                }
                if (igenyek.get(i).getHova() < min){
                    min = igenyek.get(i).getHova();
                }
            }

            System.out.println("4. feladat: A legmagasabb szint: " + max);
            System.out.println("4. feladat: A legkisebb szint: " + min);

            // 5. feladat
            int utasokkal = 0;
            int utasokNelkul = 0;

            for (int i = 1; i < igenyek.size(); i++){
                Igeny l = igenyek.get(i);
                Igeny lVissza = igenyek.get(i-1);

                if (l.getHonnan() > lVissza.getHova()){
                    utasokNelkul++;
                }
                if (l.getHova() > l.getHonnan()){
                    utasokkal++;
                }
            }

            System.out.println("5. feladat: A lift " + utasokkal + "-szor ment fel utasokkal.");
            System.out.println("5. feladat: A lift " + utasokNelkul + "-szor ment fel utasok nélkül.");
        }

        catch( IOException e ) {
            System.err.println("Hiba");
        }
    }
}