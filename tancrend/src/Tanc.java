public class Tanc {
    private String tanc;
    private String no;
    private String ferfi;

    public String getTanc() {
        return tanc;
    }
    public void setTanc(String tanc) {
        this.tanc = tanc;
    }

    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }

    public String getFerfi() {
        return ferfi;
    }
    public void setFerfi(String ferfi) {
        this.ferfi = ferfi;
    }

    public Tanc(String[] adat) {
        this.tanc = adat[0];
        this.no = adat[1];
        this.ferfi = adat[2];
    }

    public String toString() {
        return "Tánc: " +
                this.getTanc()  +
                " || Nő: " + this.getNo() +
                " || Férfi: " + this.getFerfi();
    }
}
