package fr.epsiflix.infrastructure.model;

@Entity
public class EpisodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private Integer numero;
    private String duree;

    @ManyToOne
    private SerieEntity serie;

    // Méthodes getters et setters
}