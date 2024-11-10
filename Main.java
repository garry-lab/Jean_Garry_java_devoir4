package com.company.main;

import com.company.models.Employee;
import com.company.models.Manager;
import com.company.managers.EmployeeManager;
import com.company.utils.FileHandler;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scanner = new Scanner(System.in);
        
        // Création du gestionnaire d'employés
        EmployeeManager employeeManager = new EmployeeManager();
        
        // Demander combien d'employés l'utilisateur souhaite ajouter
        System.out.println("Combien d'employés voulez-vous ajouter ?");
        int nombreEmployes = scanner.nextInt();
        scanner.nextLine(); // Consomme la nouvelle ligne après le nombre (important)

        // Saisie des informations pour chaque employé
        for (int i = 0; i < nombreEmployes; i++) {
            System.out.println("\n--- Ajout de l'employé #" + (i + 1) + " ---");

            // Demander le nom de l'employé
            System.out.print("Entrez le nom complet de l'employé : ");
            String nom = scanner.nextLine();

            // Demander le salaire de l'employé
            System.out.print("Entrez le salaire de l'employé : ");
            double salaire = scanner.nextDouble();
            scanner.nextLine(); // Consomme la nouvelle ligne après le salaire

            // Demander si l'employé est un manager
            System.out.print("Cet employé est-il un manager ? (oui/non) : ");
            String estManager = scanner.nextLine();

            if (estManager.equalsIgnoreCase("oui")) {
                // Si l'employé est un manager, demander le département
                System.out.print("Entrez le département du manager : ");
                String departement = scanner.nextLine();

                // Créer un manager
                Manager manager = new Manager(nom, salaire, departement);
                employeeManager.addEmployee(manager);
            } else {
                // Si ce n'est pas un manager, créer un employé simple
                Employee employee = new Employee(nom, salaire);
                employeeManager.addEmployee(employee);
            }
        }

        // Affichage des employés ajoutés
        System.out.println("\nListe des employés ajoutés :");
        employeeManager.printEmployees();

        // Sauvegarder les employés dans un fichier
        FileHandler.saveEmployeesToFile(employeeManager.getEmployees(), "employees.txt");
        
        scanner.close(); // Fermer le scanner à la fin
		

	}

}

