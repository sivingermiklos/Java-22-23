module css.jfxcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens css.jfxcss to javafx.fxml;
    exports css.jfxcss;
}