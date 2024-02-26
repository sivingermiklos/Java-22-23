import java.util.*;
import java.io.*;
public class jaror {
    public static void main(String[] args) {
        ArrayList<Athaladas> athaladasok = new ArrayList<>();

        try{
            RandomAccessFile raf = new RandomAccessFile("jarmu.txt", "r");
            String sor = raf.readLine();

            while(sor != null) {
                String[] adatok = sor.split(" ");

                Athaladas egyAthaladas = new Athaladas(Integer.parseInt(adatok[0]), Integer.parseInt(adatok[1]), Integer.parseInt(adatok[2]), adatok[3]);
                athaladasok.add(egyAthaladas);

                sor = raf.readLine();
            }

            System.out.println(athaladasok.size());
        }
        catch(IOException e){
            System.out.println("Hiba: " + e);
        }

        //2. feladat
        System.out.println("2. feladat");
        System.out.println(athaladasok.get(athaladasok.size() - 1).getH() - athaladasok.get(0).getH() + 1 + " óra");

        //3. feladat
        System.out.println("3. feladat");
        for(int i = 0; i < athaladasok.size() - 1; i++){
            if(athaladasok.get(i).getH() != athaladasok.get(i+1).getH() - 1){
                System.out.println(athaladasok.get(i).getH() + " óra: " + athaladasok.get(i).getRsz());
            }
        }

        //4. feladat
        System.out.println("4. feladat");
        int b = 0;
        int k = 0;
        int m = 0;
        for(int i = 0; i < athaladasok.size(); i++){
            if(athaladasok.get(i).getRsz().startsWith("B")){
                b++;
            }
            else if(athaladasok.get(i).getRsz().startsWith("K")){
                k++;
            }
            else if(athaladasok.get(i).getRsz().startsWith("M")){
                m++;
            }
        }
        System.out.println("Autóbusz: " + b);
        System.out.println("Kamion: " + k);
        System.out.println("Motor: " + m);
        System.out.println("Személygépkocsi: " + (athaladasok.size() - b - k - m));

        //5. feladat
        System.out.println("5. feladat");
        

    }

    public static int toSeconds(int h, int m, int s){
        return (h * 3600) + (m * 60) + s;
    }
}