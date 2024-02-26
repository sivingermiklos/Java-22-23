public class Noveny {
    private String nev;
    private String szin;
    private int magassag;
    private boolean eveloE;

    public Noveny(String[] adatok){
        this.nev = adatok[0];
        this.szin = adatok[1];
        this.magassag = Integer.parseInt(adatok[2]);
        this.eveloE = Boolean.parseBoolean(adatok[3]);
    }

    //----------- GETTER + SETTER --------------
    public String getNev() { return nev; }
    public void setNev(String nev) { this.nev = nev; }

    public String getSzin() { return szin; }
    public void setSzin(String szin) { this.szin = szin; }

    public int getMagassag() { return magassag; }
    public void setMagassag(int magassag) { this.magassag = magassag; }

    public boolean isEveloE() { return eveloE; }
    public void setEveloE(boolean eveloE) { this.eveloE = eveloE; }
    //------------------------------------------
}
