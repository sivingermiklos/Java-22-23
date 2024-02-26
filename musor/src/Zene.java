import java.util.Arrays;

public class Zene {
    private int perc, mp;
    private String radioSorszam, eloado, cim;

    public Zene(String[] split){
        this.radioSorszam = split[0];
        this.perc = Integer.parseInt(split[1]);
        this.mp = Integer.parseInt((split[2]));
        String songData = String.join(" ", Arrays.copyOfRange(split, 3, split.length));
        this.eloado = songData.split(":")[0];
        this.cim = songData.split(":")[1];
    }

    public int getPerc(){
        return perc;
    }

    public void setMin(int min){
        this.perc = perc;
    }

    public int getMp(){
        return mp;
    }

    public void setSec(int sec){
        this.mp = sec;
    }

    public String getRadioSorszam(){
        return radioSorszam;
    }

    public void setRadioSorszam(String radioSorszam){
        this.radioSorszam = radioSorszam;
    }

    public String getEloado(){
        return eloado;
    }

    public void setEloado(String eloado){
        this.eloado = eloado;
    }

    public String getCim(){
        return cim;
    }

    public void setCim(String cim){
        this.cim = cim;
    }

    public String toString(){
        return "Hossz: " + getPerc() + ":" + getMp() +
                "\nRádió sorszáma: " + getRadioSorszam() +
                "\n" + getEloado() +
                " - " + getCim() +
                "\n--------------------";

    }
}