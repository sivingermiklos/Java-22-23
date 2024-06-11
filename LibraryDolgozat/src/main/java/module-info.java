module doga.librarydolgozat {
    requires javafx.controls;
    requires javafx.fxml;


    opens doga.librarydolgozat to javafx.fxml;
    exports doga.librarydolgozat;
}