package fr.epsiflix.infrastructure.model;

import jakarta.persistence.Entity;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Stratégie d'héritage pour les sous-classes
public class UtilisateurEntity {
    @Id
    private UUID identifiant;
    private String motDePasse;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;

    // Méthodes getters et setters
}