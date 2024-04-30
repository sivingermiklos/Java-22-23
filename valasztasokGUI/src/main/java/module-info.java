module gui.valasztasokgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui.valasztasokgui to javafx.fxml;
    exports gui.valasztasokgui;
}