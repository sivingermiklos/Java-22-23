package doga.librarydolgozat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.collections.FXCollections;

import java.io.IOException;
import java.util.ResourceBundle;
import java.net.URL;

public class NewBookController extends DataManager implements Initializable {
    @FXML
    public TextField author;
    @FXML
    public TextField title;
    @FXML
    public TextField year;
    @FXML
    public ComboBox category;
    @FXML
    public DatePicker acquisitionDate;

    @FXML
    protected void addNewBook(){
        if (author.getText().isEmpty() || title.getText().isEmpty()|| year.getText().isEmpty() || category.getValue() == ""  || acquisitionDate.getValue().toString().isEmpty()){
            Alert a1 = new Alert(Alert.AlertType.ERROR);
            a1.setTitle("Hiányos adatok");
            a1.setHeaderText("A megadott adatok hiányosak!");
            a1.showAndWait();
        }
        else{
            Book b = new Book(author.getText(), title.getText(), year.getText(), category.getValue().toString(), acquisitionDate.getValue().toString());
            Alert a2 = new Alert(Alert.AlertType.INFORMATION);
            a2.setTitle("Könyv hozzáadva");
            a2.setHeaderText("A művelet sikeres volt!");
            a2.showAndWait();
            addBook(b);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        category.setItems(FXCollections.observableArrayList("Szépirodalom", "Scifi", "Nyelvkönyv", "Tudomány"));
    }

    @FXML
    protected void showStockView() throws IOException {
        LibraryApplication main = new LibraryApplication();
        main.changeScene("stock-view.fxml");
    }
}