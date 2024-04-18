module pt.isep.tp8.listatelefonica{
    requires javafx.controls;
    requires javafx.fxml;


    exports pt.isep.tp8.listatelefonica.ui;
    opens pt.isep.tp8.listatelefonica.ui to javafx.fxml;

}