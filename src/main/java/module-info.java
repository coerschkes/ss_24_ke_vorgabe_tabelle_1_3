module com.github.coerschkes.vorgabe_tabelle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.coerschkes.vorgabe_tabelle_1_3 to javafx.fxml;
    exports com.github.coerschkes.vorgabe_tabelle_1_3;
}