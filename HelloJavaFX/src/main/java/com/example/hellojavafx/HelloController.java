package com.example.hellojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField nameField;

    @FXML
    private Label counter;

    @FXML
    protected void onHelloButtonClick() {
        int count = Integer.parseInt(counter.getText());
        String name = nameField.getText();
        welcomeText.setText(!name.isEmpty() ? "Hello "+ name + "!" : "Hello Koroskenyi Istvan!");
        count++;
        counter.setText(String.valueOf(count));
    }
}