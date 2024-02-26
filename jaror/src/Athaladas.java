public class Athaladas {
    private int h;
    private int m;
    private int s;
    private String rsz;

    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }
    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }
    public void setS(int s) {
        this.s = s;
    }

    public String getRsz() {
        return rsz;
    }
    public void setRsz(String rsz) {
        this.rsz = rsz;
    }

    public Athaladas(int h, int m, int s, String rsz) {
        this.setH(h);
        this.setM(m);
        this.setS(s);
        this.setRsz(rsz);
    }

    @Override
    public String toString() {
        return this.getH() + ":" + this.getM() + ":" + this.getS() + " | " + this.getRsz();
    }
}
