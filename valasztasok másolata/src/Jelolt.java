public class Jelolt {
    private String korzet;
    private int szavazatok;
    private String veznev;
    private String utonev;
    private String part;

    public Jelolt(String adat[]) {
        this.korzet = adat[0];
        this.szavazatok = Integer.parseInt(adat[1]);
        this.veznev = adat[2];
        this.utonev = adat[3];
        this.part = adat[4];
    }

    public String getVeznev() {
        return veznev;
    }
    public void setVeznev(String veznev) {
        this.veznev = veznev;
    }

    public String getUtonev() {
        return utonev;
    }
    public void setUtonev(String utonev) {
        this.utonev = utonev;
    }

    public String getKorzet() {
        return korzet;
    }
    public void setKorzet(String korzet) {
        this.korzet = korzet;
    }

    public int getSzavazatok() {
        return szavazatok;
    }
    public void setSzavazatok(int szavazatok) {
        this.szavazatok = szavazatok;
    }

    public String getPart() {
        return part;
    }
    public void setPart(String part) {
        this.part = part;
    }
}