package com.example.totos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloController {
    @FXML
    public TextField eredmenyField;
    @FXML
    public CheckBox nemjoCount;
    @FXML
    public CheckBox nemjoChar;
    @FXML
    public Label nemjoCharLabel;
    @FXML
    public Button mentesButton;
    @FXML
    public Label nemjoHosszLabel;

    protected ArrayList<Character> allowedChars = new ArrayList<>(Arrays.asList('1', '2', 'X'));


    @FXML
    protected void ellenorzes(){
        nemjoCount.setSelected(false);
        nemjoChar.setSelected(false);

        String eredmeny = eredmenyField.getText();
        if (eredmeny.length() != 14){
            nemjoCount.setSelected(true);
        }
        nemjoHosszLabel.setText(String.valueOf(eredmeny.length()));

        char[] resultChars = eredmeny.toCharArray();
        ArrayList<String> incorrectChars = new ArrayList<>();
        for (char c : resultChars){
            if (!allowedChars.contains(c) && !incorrectChars.contains(String.valueOf(c))){
                incorrectChars.add(String.valueOf(c));
                nemjoChar.setSelected(true);
            }
        }

        nemjoCharLabel.setText(String.join(",", incorrectChars));

        if (nemjoChar.isSelected() || nemjoCount.isSelected()){
            mentesButton.setDisable(true);
            return;
        }
        mentesButton.setDisable(false);
    }
}
