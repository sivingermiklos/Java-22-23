package com.example.sudoku;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Button minus;
    @FXML
    private TextField number;
    @FXML
    private Button plus;
    @FXML
    private TextField kezdoallapot;
    @FXML
    private Label hossz;

    @FXML
    protected void add() {
        int n = Integer.parseInt(number.getText());
        if(n < 9) n++;
        number.setText(Integer.toString(n));
    }
    @FXML
    protected void minus() {
        int n = Integer.parseInt(number.getText());
        if(n > 4) n--;
        number.setText(Integer.toString(n));
    }

    @FXML
    protected void kezdoallapot() {
        hossz.setText(Integer.toString(kezdoallapot.getText().length()));
    }

    @FXML
    protected void checkSudoku() {
        String nums = kezdoallapot.getText();
        int sudokuType = Integer.parseInt(number.getText());
        String uzenet = "A sudoku megfelelő!";
        if(nums.length() > (sudokuType * sudokuType)){
            uzenet = "törölj: " + (nums.length() - (sudokuType * sudokuType));
        }
        if(nums.length() < (sudokuType * sudokuType)){
            uzenet = "még: " + ((sudokuType * sudokuType) - nums.length());
        }

        showAlert(uzenet);
    }

    protected void showAlert(String uzenet){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Figyelem!");
        alert.setHeaderText(null);
        alert.setContentText(uzenet);
        alert.showAndWait();
    }
}