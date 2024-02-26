module com.example.totos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.totos to javafx.fxml;
    exports com.example.totos;
}