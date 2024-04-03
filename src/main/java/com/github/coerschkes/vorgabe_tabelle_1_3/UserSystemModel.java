package com.github.coerschkes.vorgabe_tabelle_1_3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public final class UserSystemModel {
    private final ObservableList<Person> personList;

    public UserSystemModel(ObservableList<Person> personList) {
        this.personList = personList;
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void addToList(final Person person) {
        this.personList.add(person);
    }
}
