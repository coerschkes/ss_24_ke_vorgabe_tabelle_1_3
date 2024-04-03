package com.github.coerschkes.vorgabe_tabelle_1_3;

import javafx.collections.*;

public final class UserSystemModel {
	
	// Anstatt mit null muss personen mit einer ObservableList gefuellt werden.
  	private final ObservableList<Person> personList = null;
		
	public ObservableList<Person> getPersonList() {
		return personList;
	}
	 	 
}
