package com.example.autok;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AutokController {
    private ArrayList<Auto> autok = new ArrayList<>();

    @FXML
    private TextField markaTextField;
    @FXML
    private TextField tipusTextField;
    @FXML
    private TextField hengerutTextField;
    @FXML
    private TextField ferohelyTextField;
    @FXML
    private TextField rendszamTextField;

    @FXML
    protected void rogzit(){
        autok.add(new Auto(markaTextField.getText(), tipusTextField.getText(), Integer.parseInt(hengerutTextField.getText()), Integer.parseInt(ferohelyTextField.getText()), rendszamTextField.getText()));
        markaTextField.setText("");
        tipusTextField.setText("");
        hengerutTextField.setText("");
        ferohelyTextField.setText("");
        rendszamTextField.setText("");
        for (Auto auto : autok) {
            System.out.println(auto);
        }
    }
}