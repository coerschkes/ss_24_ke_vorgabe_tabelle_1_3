package com.github.coerschkes.vorgabe_tabelle_1_3.application;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
            resetTextFields();
        }
    }

    @FXML
    private void removeLine() {
        final int selectedItemIndex = tablePerson.getSelectionModel().getSelectedIndex();
        this.userSystemModel.removeFromList(selectedItemIndex);
    }

    @FXML
    private void initialize() {
        tablePerson.setEditable(true);
        columnPerson.setCellValueFactory(new PropertyValueFactory<>("surname"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        this.userSystemModel.registerListener(change -> refreshTable());
    }

    private void resetTextFields() {
        this.textName.setText("");
        this.textSurname.setText("");
    }

    private void refreshTable() {
        this.tablePerson.setItems(this.userSystemModel.personList());
    }

    private boolean textFieldsAreValid() {
        return textSurname.getText() != null &&
                !textSurname.getText().isEmpty() &&
                textName.getText() != null &&
                !textName.getText().isEmpty();
    }
}


