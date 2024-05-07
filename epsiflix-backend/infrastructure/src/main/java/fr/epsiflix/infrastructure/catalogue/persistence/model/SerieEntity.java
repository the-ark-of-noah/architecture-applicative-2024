package fr.epsiflix.infrastructure.model;

@Entity
public class SerieEntity extends ContenuEntity {
    private Integer nombreSaisons;

    @OneToMany(mappedBy = "serie")
    private List<EpisodeEntity> episodes;

    // Méthodes getters et setters
}