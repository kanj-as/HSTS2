module org.HSTS_2020 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.HSTS_2020 to javafx.fxml;
    opens org.HSTS_2020.Client.HSTSgui to javafx.fxml;
    exports org.HSTS_2020;
    exports org.HSTS_2020.Client.HSTSgui;
}