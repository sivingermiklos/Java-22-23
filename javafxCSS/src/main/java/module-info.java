module css.javafxcss {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens css.javafxcss to javafx.fxml;
    exports css.javafxcss;
}