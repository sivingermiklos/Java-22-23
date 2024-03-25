module com.example.autok {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.autok to javafx.fxml;
    exports com.example.autok;
}