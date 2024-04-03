package com.github.coerschkes.vorgabe_tabelle_1_3;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class UserSystemControl {
    private final UserSystemModel userSystemModel;

    @FXML
    private TableView<Person> tablePerson;
    @FXML
    private TableColumn<Person, String> columnPerson;
    @FXML
    private TableColumn<Person, String> columnName;

    public UserSystemControl() {
        this.userSystemModel = new UserSystemModel();
    }

    @FXML
    private void addToList() {
        // Hinzufuegen eines Objekts vom Typ Person mittels Methode
        // add aus ObservableList<E>.
    }

    @FXML
    private void removeLine() {
        // Selektieren einer markierten Zeile mittels getSelectionModel
        // aus TableView und getSelectedIndex aus TableViewSelectionModel.
        // Loeschen einer Zeile mittels remove aus ObservableList<E>.

    }

    @FXML
    private void initialize() {
        // Tabellenspalten erstellen und fuellen
        tablePerson.setEditable(true);
        columnPerson.setCellValueFactory(
                new PropertyValueFactory<>("vorname"));
        // Hinzufuegen weiterer Spalten

        // Hinzufuegen von Zeilen mittels setItems aus TableView

    }

}


