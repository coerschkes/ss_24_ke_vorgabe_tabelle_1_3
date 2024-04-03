package com.github.coerschkes.vorgabe_tabelle_1_3.application;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.function.Consumer;

public record UserSystemModel(ObservableList<Person> personList) {
    public void addToList(final Person person) {
        this.personList.add(person);
    }

    public void removeFromList(int index) {
        this.personList.remove(index);
    }

    public void registerListener(final Consumer<ListChangeListener.Change<? extends Person>> callback) {
        this.personList.addListener((ListChangeListener<Person>) callback::accept);
    }
}
