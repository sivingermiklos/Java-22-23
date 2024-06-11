module clcss.contactlistcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens clcss.contactlistcss to javafx.fxml;
    exports clcss.contactlistcss;
}