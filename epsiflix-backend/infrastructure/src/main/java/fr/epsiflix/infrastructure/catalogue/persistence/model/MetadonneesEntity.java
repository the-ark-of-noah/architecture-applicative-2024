package fr.epsiflix.infrastructure.catalogue.model;

@Entity
public class MetadonneesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String genre;
    private Date dateDeSortie;

    @ManyToOne
    private ContenuEntity contenu;

    // Méthodes getters et setters
}
