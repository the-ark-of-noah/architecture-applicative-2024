package fr.epsiflix.infrastructure.model;

@Entity
public class BandeAnnonceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lien;
    private String duree;
    private Date dateDeSortie;

    @ManyToOne
    private ContenuEntity contenu;

    // Méthodes getters et setters
}