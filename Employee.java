package com.company.models;

public class Employee {
	
	private String name;
    private double salary;

    // Constructeur
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Méthode pour afficher les informations d'un employé
    @Override
    public String toString() {
        return "Nom: " + name + ", Salaire: " + salary;
	
	

}
}
