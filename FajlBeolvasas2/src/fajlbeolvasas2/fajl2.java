package fajlbeolvasas2;

import java.io.*;

public class fajl2 {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        int[] szamok = new int[5];
        // Fájl beolvasása soronként----------------------------------------
        try{
          raf = new RandomAccessFile("adat2.txt","r");
          // első sor beolvasása, ebben a példában az elemek számát adja meg
          int db = Integer.parseInt(raf.readLine());
          
          for(int i = 0; i < db; i++){
              sor = raf.readLine();
              szamok[i] = Integer.parseInt(sor);
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
