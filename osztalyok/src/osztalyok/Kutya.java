package osztalyok;

import java.io.*;
import java.util.*;
public class Kutya {


    private String nev;
    private String fajta;
    private String szin;
    private int ttomeg;

//-------------------------------------
    public String getNev(){
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getFajta() {
        return fajta;
    }
    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public String getSzin() {
        return szin;
    }
    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getTtomeg() {
        return ttomeg;
    }
    public void setTtomeg(int ttomeg) {
        this.ttomeg = ttomeg;
    }
//-------------------------------------
    public Kutya(String name, String breed, String color, int weight){
        this.nev = name;
        this.fajta = breed;
        this.szin = color;
        this.ttomeg = weight;
    }

    public void ugat(){
        System.out.println("Woof-woof!");
    }
}