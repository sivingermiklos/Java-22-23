package css.jfxlogincss;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class LoginController {
    @FXML
    public TextField usr;
    @FXML
    public PasswordField pw;

    @FXML
    protected void onLoginButtonClick() throws IOException {
        Alert alertNemJo = new Alert(Alert.AlertType.ERROR, "Hibás felhasználónév vagy jelszó!");
        HelloApplication main = new HelloApplication();
        if(!(usr.getText().equals("vehu"))){
            alertNemJo.show();
        }
        else if(!(pw.getText().equals("majom"))){
            alertNemJo.show();
        }
        else{
            main.changeScene("info-view.fxml");
            System.out.println("szia mukodok");
        }
    }
}