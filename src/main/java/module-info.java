module org.HSTS_2020 {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.HSTS_2020 to javafx.fxml;
    exports org.HSTS_2020;
}