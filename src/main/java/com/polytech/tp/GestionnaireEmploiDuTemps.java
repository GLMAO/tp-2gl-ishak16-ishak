package com.polytech.tp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private final List<ICours> listeCours = new ArrayList<>();
    private final List<Observer> observateurs = new ArrayList<>();

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        String message = "Nouveau cours ajouté : " + cours.getDescription();
        System.out.println(message);
        notifyObservers(message);
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        notifyObservers(message);
    }

    public void setChangement(String message) {
        notifyObservers(message);
    }

    @Override
    public void attach(Observer o) {
        if (o != null && !observateurs.contains(o)) {
            observateurs.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observateurs.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : new ArrayList<>(observateurs)) {
            observer.update(message);
        }
    }

    public List<ICours> getListeCours() {
        return Collections.unmodifiableList(listeCours);
    }
}