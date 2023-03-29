package fajlbeolvasas2;

import java.io.*;

public class Fajlbeolvasas2 {

    public static void main(String[] args) {
        RandomAccessFile raf, carsOut;
        String sor;
        String[] cars = new String[8];
        
        // Fájl beolvasása soronként----------------------------------------
        try{
          raf = new RandomAccessFile("cars.txt","r");
          // első sor beolvasása, ebben a példában az elemek számát adja meg
          int db = Integer.parseInt(raf.readLine());
          
          for(int i = 0; i < db; i++){
              sor = raf.readLine();
              cars[i] = sor;
          }

          raf.close();
        }
        catch( IOException e ){
          System.err.println("HIBA");
        }
        
        for( String i : cars ){
            System.out.println(i);
        }
        
        
        try{
            carsOut = new RandomAccessFile("carsout.txt","rw");
                    
            for( String i : cars ){
                if(i.startsWith("F")){
                    carsOut.writeBytes(i+"\n");
                }
            }
        }
        catch( IOException e ){
          System.err.println("HIBA");
        }
    }
    
}
