module com.example.tab2025 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tab2025 to javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    exports com.example.tab2025;
    requires mysql.connector.j;
    requires java.sql;
    requires java.desktop;
    opens  com.example.modelos;

}