package com.example.autok;

public class Auto {
    private String marka;
    private String tipus;
    private int hengerut;
    private int ferohely;
    private String rendszam;

    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipus() {
        return tipus;
    }
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getHengerut() {
        return hengerut;
    }
    public void setHengerut(int hengerut) {
        this.hengerut = hengerut;
    }

    public int getFerohely() {
        return ferohely;
    }
    private void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public String getRendszam() {
        return rendszam;
    }
    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public Auto(String marka, String tipus, int hengerut, int ferohely, String rendszam) {
        this.setMarka(marka);x
        this.setTipus(tipus);
        this.setHengerut(hengerut);
        this.setFerohely(ferohely);
        this.setRendszam(rendszam);
    }

    @Override
    public String toString() {
        return "Autó | " +
                "márka: " + marka +
                ", típus: " + tipus +
                ", hengerűrtartalom: " + hengerut +
                ", férőhely: " + ferohely +
                ", rendszám: '" + rendszam;
    }
}