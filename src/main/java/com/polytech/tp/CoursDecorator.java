package com.polytech.tp;

/**
 * Classe de base pour tous les décorateurs de cours. Elle délègue par défaut les appels
 * aux méthodes de l'interface {@link ICours} au cours décoré.
 */
public abstract class CoursDecorator implements ICours {
    protected final ICours coursDecorated;

    protected CoursDecorator(ICours cours) {
        this.coursDecorated = cours;
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription();
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}