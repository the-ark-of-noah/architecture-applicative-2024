package fr.espiflix.infrastructure.model;

@Entity
public class ContenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String description;
    private Date dateAjout;
    private String duree;
    private String lien;

    @OneToMany(mappedBy = "contenu")
    private List<MetadonneesEntity> metadonnees;

    @OneToMany(mappedBy = "contenu")
    private List<BandeAnnonceEntity> bandeAnnonces;

    // Méthodes getters et setters
}