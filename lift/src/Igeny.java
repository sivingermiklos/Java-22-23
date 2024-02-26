public class Igeny {
    private int ora;
    private int perc;
    private int mperc;
    private int csapat;
    private int honnan;
    private int hova;

    public int getOra() {
        return ora;
    }
    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getPerc() {
        return perc;
    }
    public void setPerc(int perc) {
        this.perc = perc;
    }

    public int getMperc() {
        return mperc;
    }
    public void setMperc(int mperc) {
        this.mperc = mperc;
    }

    public int getCsapat() {
        return csapat;
    }
    public void setCsapat(int csapat) {
        this.csapat = csapat;
    }

    public int getHonnan() {
        return honnan;
    }
    public void setHonnan(int honnan) {
        this.honnan = honnan;
    }

    public int getHova() {
        return hova;
    }
    public void setHova(int hova) {
        this.hova = hova;
    }


    public Igeny(int[] adatok){
        this.ora = adatok[0];
        this.perc = adatok[1];
        this.mperc = adatok[2];
        this.csapat = adatok[3];
        this.honnan = adatok[4];
        this.hova = adatok[5];
    }

    public String toString() {
        return "Igény -> " +
                "óra: " + this.getOra() +
                " || perc: " + this.getPerc() +
                " || másodperc: " + this.getMperc() +
                " || csapat sorszáma: " + this.getCsapat() +
                " || induló szint: " + this.getHonnan() +
                " || célszint: " + this.getHova();
    }
}