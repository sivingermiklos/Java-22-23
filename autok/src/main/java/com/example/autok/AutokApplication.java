package com.example.autok;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AutokApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AutokApplication.class.getResource("autok-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 360);
        stage.setTitle("Autókölcsönző");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}