package com.polytech.tp;

/**
 * Builder permettant de créer des instances de {@link Cours} de manière fluide.
 */
public class CoursBuilder {

    private String matiere;
    private String enseignant;
    private String salle = "";
    private String date = "";
    private String heureDebut = "";
    private boolean estOptionnel;
    private String niveau = "";
    private boolean necessiteProjecteur;

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }

    public CoursBuilder setOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }

    /**
     * Construit l'instance de {@link Cours}. Les champs essentiels (matière et enseignant)
     * doivent être renseignés avant l'appel à cette méthode.
     */
    public Cours build() {
        if (matiere == null || enseignant == null) {
            throw new IllegalStateException("Matière et enseignant doivent être fournis pour créer un cours.");
        }
        return new Cours(
            matiere,
            enseignant,
            salle,
            date,
            heureDebut,
            estOptionnel,
            niveau,
            necessiteProjecteur
        );
    }
}