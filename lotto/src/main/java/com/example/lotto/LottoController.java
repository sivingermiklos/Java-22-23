package com.example.lotto;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Random;

public class LottoController {
    @FXML
    private TextField LottoSzam1;
    @FXML
    private TextField LottoSzam2;
    @FXML
    private TextField LottoSzam3;
    @FXML
    private TextField LottoSzam4;
    @FXML
    private TextField LottoSzam5;

    @FXML
    private TextField kisorsoltLottoSzam1;
    @FXML
    private TextField kisorsoltLottoSzam2;
    @FXML
    private TextField kisorsoltLottoSzam3;
    @FXML
    private TextField kisorsoltLottoSzam4;
    @FXML
    private TextField kisorsoltLottoSzam5;

    @FXML
    private Button sorsolasButton;

    private final int MIN = 1;
    private final int MAX = 90;
    private int genNum1 = 0;
    private int genNum2 = 0;
    private int genNum3 = 0;
    private int genNum4 = 0;
    private int genNum5 = 0;
    private int getRandomNumber() {
        int random = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        if (random == genNum1 || random == genNum2 || random == genNum3 || random == genNum4 || random == genNum5) {
            return getRandomNumber();
        }
        return random;
    }
    @FXML
    protected void sorsol(){
        genNum1 = getRandomNumber();
        genNum2 = getRandomNumber();
        genNum3 = getRandomNumber();
        genNum4 = getRandomNumber();
        genNum5 = getRandomNumber();
        kisorsoltLottoSzam1.setText(String.valueOf(genNum1));
        kisorsoltLottoSzam2.setText(String.valueOf(genNum2));
        kisorsoltLottoSzam3.setText(String.valueOf(genNum3));
        kisorsoltLottoSzam4.setText(String.valueOf(genNum4));
        kisorsoltLottoSzam5.setText(String.valueOf(genNum5));
    }
}