package com.company.utils;

import com.company.models.Employee;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler {
	
	// Méthode pour sauvegarder les employés dans un fichier texte
    public static void saveEmployeesToFile(List<Employee> employees, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Employee employee : employees) {
                writer.write(employee.getName() + ", " + employee.getSalary() + "\n");
            }
            System.out.println("Les données des employés ont été sauvegardées dans le fichier.");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde des employés : " + e.getMessage());
        }
    }

}
