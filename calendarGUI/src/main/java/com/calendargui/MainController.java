package com.calendargui;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class MainController {

    @FXML
    private Button createEventButton;
    @FXML
    private Button eventListButton;
    @FXML
    private Button searchEventButton;

    @FXML
    protected void createEvent() throws IOException {
        MainApplication main = new MainApplication();
        main.changeScene("createevent-view.fxml");
    }

    @FXML
    protected void eventList() throws IOException  {
        MainApplication main = new MainApplication();
        main.changeScene("eventlist-view.fxml");
    }

    @FXML
    protected void searchEvent() throws IOException {
        MainApplication main = new MainApplication();
        main.changeScene("searchevent-view.fxml");
    }
}
