package com.company.models;

public class Manager extends Employee{
	
	private String department;

    // Constructeur
    public Manager(String name, double salary, String department) {
        super(name, salary);  // Appel au constructeur de la classe parente (Employee)
        this.department = department;
    }

    // Getter et Setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return super.toString() + ", Département: " + department;

}
}
