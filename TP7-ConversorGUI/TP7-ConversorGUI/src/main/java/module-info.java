module com.example.tp7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp7 to javafx.fxml;
    exports com.example.tp7;
}