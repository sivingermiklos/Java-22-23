package clcss.contactlistcss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AddContactApplication extends Application {
    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(AddContactApplication.class.getResource("addcontact-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 260, 200);
        stage.setTitle("Contact list");
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(String view) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(view));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}