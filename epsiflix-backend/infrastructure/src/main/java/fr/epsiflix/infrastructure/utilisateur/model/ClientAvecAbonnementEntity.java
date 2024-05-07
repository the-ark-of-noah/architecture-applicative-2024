package fr.epsiflix.infrastructure.utilisateur.model;

@Entity
public class ClientAvecAbonnementEntity extends UtilisateurEntity {
    private Date dateDebut;
    private Date dateFin;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement abonnement;

    @OneToMany(mappedBy = "client")
    private List<PreferenceUtilisateurEntity> preferences;

    // Méthodes spécifiques au client avec abonnement
}