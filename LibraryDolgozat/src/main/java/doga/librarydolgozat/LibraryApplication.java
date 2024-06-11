package doga.librarydolgozat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class LibraryApplication extends Application {
    public static ArrayList<Book> books = new ArrayList<>();
    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LibraryApplication.class.getResource("createbook-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 375);
        stage.setTitle("Könyvtár nyilvántartó program");
        stage.setScene(scene);
        stg = stage;
        stage.show();
    }

    public void changeScene(String view) throws IOException {
        Parent pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(view)));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}