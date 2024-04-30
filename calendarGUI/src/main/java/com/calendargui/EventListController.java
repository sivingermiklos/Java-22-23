package com.calendargui;

import javafx.fxml.FXML;

import java.io.IOException;

public class EventListController {
    @FXML
    protected void backToMain() throws IOException {
        MainApplication main = new MainApplication();
        main.changeScene("main-view.fxml");
    }
}
