package com.company.models;

public class Departement {
	
	private String name;

    // Constructeur
    public void Department(String name) {
        this.name = name;
    }

    // Getter et Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Département: " + name;

}
}
