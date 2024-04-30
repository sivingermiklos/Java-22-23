package gui.valasztasokgui;

public class Jelolt {
    private int kerulet;
    private int szavazatok;
    private String vezetekNev;
    private String keresztNev;
    private String part;

    public Jelolt(int kerulet, int szavazatok, String vezetekNev, String keresztNev, String part) {
        this.setKerulet(kerulet);
        this.setSzavazatok(szavazatok);
        this.setVezetekNev(vezetekNev);
        this.setKeresztNev(keresztNev);
        this.setPart(part);
    }

    public int getKerulet() {
        return kerulet;
    }
    public void setKerulet(int kerulet) {
        this.kerulet = kerulet;
    }

    public int getSzavazatok() {
        return szavazatok;
    }
    public void setSzavazatok(int szavazatok) {
        this.szavazatok = szavazatok;
    }

    public String getVezetekNev() {
        return vezetekNev;
    }
    public void setVezetekNev(String vezetekNev) {
        this.vezetekNev = vezetekNev;
    }

    public String getKeresztNev() {
        return keresztNev;
    }

    public void setKeresztNev(String keresztNev) {
        this.keresztNev = keresztNev;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String toString(){
        return getKerulet() + " " +
               getSzavazatok() + " " +
               getVezetekNev() + " " +
               getKeresztNev() + " " +
               getPart();
    }
}