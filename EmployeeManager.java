package com.company.managers;

import com.company.models.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	
	private List<Employee> employees = new ArrayList<>();

    // Méthode pour ajouter un employé
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Méthode pour obtenir la liste des employés
    public List<Employee> getEmployees() {
        return employees;
    }

    // Méthode pour afficher tous les employés
    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);

}
    }
}
