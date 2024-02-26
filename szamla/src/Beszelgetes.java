import java.util.Arrays;

public class Beszelgetes {
    private String telefonSzam;
    private int[] hivasStart = new int[3];
    private int[] hivasVege = new int[3];

    public String getTelefonSzam() {
        return telefonSzam;
    }
    public void setTelefonSzam(String telefonSzam) {
        if(Integer.parseInt(telefonSzam) > 0){
            this.telefonSzam = telefonSzam;
        }
    }

    public int[] getHivasStart() {
        return hivasStart;
    }
    public void setHivasStart(int[] hivasStart) {
        this.hivasStart = hivasStart;
    }

    public int[] getHivasVege() {
        return hivasVege;
    }
    public void setHivasVege(int[] hivasVege) {
        this.hivasVege = hivasVege;
    }

    public Beszelgetes(String s, String t) {
        this.setTelefonSzam(t);
        String[] sor = s.split(" ");
        if (sor.length == 6) {
            int[] hivasidok = new int[sor.length];
            for (int i = 0; i < sor.length; i++) {
                hivasidok[i] = Integer.parseInt(sor[i]);
            }
            setHivasStart(Arrays.copyOfRange(hivasidok, 0, 3));
            setHivasVege(Arrays.copyOfRange(hivasidok, 3, 6));
        }
    }

    public String toString() {
        return "Telefonszám: " + getTelefonSzam() +
                "\nHívás kezdete: " + Arrays.toString(hivasStart) +
                "\nHívás vége: " + Arrays.toString(hivasVege);
    }
}
