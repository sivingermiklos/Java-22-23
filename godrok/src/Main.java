import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> pit = new ArrayList<>();
        Scanner bill = new Scanner(System.in);

        try {
            RandomAccessFile raf = new RandomAccessFile("melyseg.txt", "r");

            String sor = raf.readLine();
            while (sor != null) {
                pit.add(Integer.parseInt(sor));
                sor = raf.readLine();
            }

            raf.close();
        } catch (IOException e) {
            System.err.println("Hiba" + e);
        }

        System.out.println("1. feladat");
        System.out.println("Az fájl adatainak száma: " + pit.size());

        System.out.println("\n2. feladat");
        System.out.print("Adjon meg egy távolságértéket! ");
        int input = bill.nextInt();
        System.out.println("Ezen a helyen a felszín " + pit.get(input) + " méter mélyen van.");

        System.out.println("\n3. feladat");
        int zeroCount = 0;
        for (int i = 0; i < pit.size(); i++){
            if(pit.get(i).equals(0)){
                zeroCount++;
            }
        }
        double erintetlen = (double) zeroCount / pit.size();
        System.out.println("Az érintetlen terület aránya " + String.format("%.2f", erintetlen * 100) + "%.");

        try {
            RandomAccessFile raf = new RandomAccessFile("godrok.txt", "rw");

            int elozo = pit.get(0);
            ArrayList<String> egySor = new ArrayList<>();
            ArrayList<ArrayList<String>> sorok = new ArrayList<>();

            for (int ertek : pit) {
                if (ertek > 0) {
                    egySor.add(Integer.toString(ertek));
                }
                if (ertek == 0 && elozo > 0) {
                    sorok.add(new ArrayList<>(egySor));
                    egySor.clear();
                }
                elozo = ertek;
            }

            for (ArrayList<String> sor : sorok) {
                raf.write((String.join(" ", sor) + "\n").getBytes());
            }

            raf.close();

            System.out.println("\n5. feladat");
            System.out.println("A gödrök száma: " + sorok.size());
        } catch (IOException e) {
            System.err.println("Hiba" + e);
        }

        System.out.println("\n6. feladat");

        if (pit.get(input) > 0) {
            System.out.print("a) ");
            int poz = input - 1;
            while (pit.get(poz) > 0) {
                poz--;
            }
            int kezdet = poz + 2;
            poz = input;
            while (pit.get(poz) > 0) {
                poz++;
            }
            int vege = poz;
            System.out.println("A gödör kezdete: " + kezdet + " méter, a gödör vége: " + vege + " méter.");

            System.out.print("b) ");
            poz = kezdet;
            while (pit.get(poz) >= pit.get(poz - 1) && poz <= vege) {
                poz++;
            }
            while (pit.get(poz) <= pit.get(poz - 1) && poz <= vege) {
                poz++;
            }
            if (poz > vege) {
                System.out.println("Folyamatosan mélyül.");
            } else {
                System.out.println("Nem mélyül folyamatosan.");
            }

            System.out.print("c) ");
            List<Integer> resztombList = pit.subList(kezdet - 1, vege);
            int[] resztomb = new int[resztombList.size()];
            for (int i = 0; i < resztombList.size(); i++) {
                resztomb[i] = resztombList.get(i);
            }
            int legnagyobbMelyseg = Arrays.stream(resztomb).max().getAsInt();
            System.out.println("A legnagyobb mélysége " + legnagyobbMelyseg + " méter.");

            System.out.print("d) ");
            int terfogat = 10 * Arrays.stream(resztomb).sum();
            System.out.println("A térfogata " + terfogat + " m^3.");

            System.out.print("e) ");
            int mennyiseg = terfogat - 10 * (vege - kezdet + 1);
            System.out.println("A vizmennyiség " + mennyiseg + " m^3.");
        } else {
            System.out.println("Az adott helyen nincs gödör.");
        }
    }
}