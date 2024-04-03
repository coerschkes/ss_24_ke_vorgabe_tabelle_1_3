package com.github.coerschkes.vorgabe_tabelle_1_3;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class UserSystemControl {
    private final UserSystemModel userSystemModel;

    @FXML
    private TableView<Person> tablePerson;
    @FXML
    private TableColumn<Person, String> columnPerson;
    @FXML
    private TableColumn<Person, String> columnName;
    @FXML
    private TextField textSurname;
    @FXML
    private TextField textName;

    public UserSystemControl() {
        this.userSystemModel = new UserSystemModel(FXCollections.observableArrayList());
    }

    @FXML
    private void addToList() {
        if (textFieldsAreValid()) {
            final Person person = new Person(textSurname.getText(), textName.getText());
            this.userSystemModel.addToList(person);
            this.textName.setText("");
            this.textSurname.setText("");
        }
    }

    @FXML
    private void removeLine() {
        // Selektieren einer markierten Zeile mittels getSelectionModel
        // aus TableView und getSelectedIndex aus TableViewSelectionModel.
        // Loeschen einer Zeile mittels remove aus ObservableList<E>.

    }

    @FXML
    private void initialize() {
        tablePerson.setEditable(true);
        columnPerson.setCellValueFactory(new PropertyValueFactory<>("surname"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        this.userSystemModel.getPersonList().addListener((ListChangeListener<Person>) change -> refreshTable());
    }

    private void refreshTable() {
        this.tablePerson.setItems(this.userSystemModel.getPersonList());
    }

    private boolean textFieldsAreValid() {
        return textSurname.getText() != null &&
                !textSurname.getText().isEmpty() &&
                textName.getText() != null &&
                !textName.getText().isEmpty();
    }
}


