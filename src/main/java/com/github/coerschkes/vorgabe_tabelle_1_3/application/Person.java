package com.github.coerschkes.vorgabe_tabelle_1_3.application;

public class Person {
    private String surname;
    private String name;
   
    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}  
  
}
