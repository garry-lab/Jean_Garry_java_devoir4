package com.company.managers;

import com.company.models.Departement;
import java.util.ArrayList;
import java.util.List;

public class DepartementManager {
	
	private List<Departement> departements = new ArrayList<>();

    // Méthode pour ajouter un département
    public void addDepartment(Departement departement) {
        departements.add(departement);
    }

    // Méthode pour obtenir la liste des départements
    public List<Departement> getDepartements() {
        return departements;
    }

    // Méthode pour afficher tous les départements
    public void printDepartements() {
        for (Departement departement : departements) {
            System.out.println(departement);

}
    }
}
