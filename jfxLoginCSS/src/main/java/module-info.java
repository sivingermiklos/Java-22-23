module css.jfxlogincss {
    requires javafx.controls;
    requires javafx.fxml;


    opens css.jfxlogincss to javafx.fxml;
    exports css.jfxlogincss;
}