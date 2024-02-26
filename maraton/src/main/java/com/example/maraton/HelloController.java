package com.example.maraton;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private ComboBox<String> distanceComboBox;

    @FXML
    private void initialize(){
        distanceComboBox.setItems(FXCollections.observableArrayList(
                "Mini - 16km",
                       "Rövid - 38km",
                       "Pedelec - 54km",
                       "Közép - 57km",
                       "Hosszú - 94km"
        ));

        distanceComboBox.getSelectionModel().select(3);
    }

    @FXML
    private TextField timeTextField;
    @FXML
    private Label avgSpeedKmhLabel;
    @FXML
    private Label avgSpeedMsLabel;

    @FXML
    private void calculate(){
        int selected = Integer.parseInt(distanceComboBox.getSelectionModel().getSelectedItem().replaceAll("[^0-9]", ""));

        String[] time = timeTextField.getText().split(":");
        double timeHours = Double.parseDouble(time[0]) + (Double.parseDouble(time[1]) / 60) + (Double.parseDouble(time[2]) / 3600);

        double speedKmh = selected / timeHours;
        avgSpeedKmhLabel.setText("Átlagsebesség [km/h]: " + (Math.round(speedKmh * 100.0) / 100.0));

        double speedMs = speedKmh * (1000.0 / 3600.0);
        avgSpeedMsLabel.setText("Átlagsebesség [m/s]: " + (Math.round(speedMs * 100.0) / 100.0));
    }
}