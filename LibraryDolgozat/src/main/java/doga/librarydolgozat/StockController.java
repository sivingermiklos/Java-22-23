package doga.librarydolgozat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.io.IOException;
import java.util.ResourceBundle;

public class StockController extends DataManager implements Initializable {
    public Label szepirodalom;
    public Label scifi;
    public Label nyelvkonyv;
    public Label tudomany;

    public void initialize(URL location, ResourceBundle resources) {
        int[] categories = new int[4];
        for (Book b:getStock()){
            switch (b.category){
                case "Szépirodalom":
                    categories[0]++;
                    break;
                case "Scifi":
                    categories[1]++;
                    break;
                case "Nyelvkönyv":
                    categories[2]++;
                    break;
                case "Tudomány":
                    categories[3]++;
                    break;
            }
        }
        szepirodalom.setText(String.valueOf(categories[0]));
        scifi.setText(String.valueOf(categories[1]));
        nyelvkonyv.setText(String.valueOf(categories[2]));
        tudomany.setText(String.valueOf(categories[3]));
    }

    @FXML
    protected void showCreateBookView() throws IOException {
        LibraryApplication main = new LibraryApplication();
        main.changeScene("createbook-view.fxml");
    }
}
