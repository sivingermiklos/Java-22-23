package gui.valasztasokgui;

import java.io.RandomAccessFile;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class ValasztasokController {
    @FXML
    public TextField kerulet;
    @FXML
    public TextField szavazatok;
    @FXML
    public TextField vezetekNev;
    @FXML
    public TextField keresztNev;
    @FXML
    public TextField part;

    ArrayList<Jelolt> jeloltek = new ArrayList<>();

    @FXML
    protected void fajlBeolvasas(){
        try{
            RandomAccessFile raf = new RandomAccessFile("szavazatok.txt", "r");
            String sor = raf.readLine();
            while (sor != null){
                String[] adat = sor.split(" ");
                jeloltek.add(new Jelolt(Integer.parseInt(adat[0]), Integer.parseInt(adat[1]), adat[2], adat[3], adat[4]));
                sor = raf.readLine();
            }
            raf.close();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(jeloltek.toString());
    }

    @FXML
    protected void addJelolt(){
        String[] adat = {kerulet.getText(), szavazatok.getText(), vezetekNev.getText(), keresztNev.getText(), part.getText()};

        for (String s: adat){
            if (s.equals(" ")){
                return;
            }
        }

        try{
            Integer.parseInt(adat[0]);
            Integer.parseInt(adat[1]);
        }
        catch (Exception e){
            return;
        }

        try{
            RandomAccessFile raf = new RandomAccessFile("szavazatok.txt", "rw");
            String sor = "\n" + String.join(" ", adat);
            raf.seek(raf.length());
            raf.writeBytes(sor);
            jeloltek.add(new Jelolt(Integer.parseInt(adat[0]), Integer.parseInt(adat[1]), adat[2], adat[3], adat[4]));
            raf.close();
            System.out.println(jeloltek.toString());
        }
        catch (Exception e){
            return;
        }
    }
}