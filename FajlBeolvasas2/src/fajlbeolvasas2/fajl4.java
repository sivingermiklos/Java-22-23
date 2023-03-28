package fajlbeolvasas2;

import java.io.*;
import java.util.ArrayList;

public class fajl4 {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<Integer> szamok = new ArrayList<>();

        try{
          raf = new RandomAccessFile("adat1.txt","r");

          int db = 0;
          sor = raf.readLine();

          while( sor != null ){
            szamok.add(Integer.parseInt(sor));
            db++;
            sor = raf.readLine();
          }

          raf.close();
        }
        catch( IOException e ){
          System.err.println("HIBA");
        }

        for( Integer i : szamok ){
          System.out.println(i);
        }
    }
}
