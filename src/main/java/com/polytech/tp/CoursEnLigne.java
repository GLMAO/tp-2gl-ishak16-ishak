package com.polytech.tp;

/**
 * Décorateur ajoutant la mention "En ligne" à la description du cours.
 */
public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}
