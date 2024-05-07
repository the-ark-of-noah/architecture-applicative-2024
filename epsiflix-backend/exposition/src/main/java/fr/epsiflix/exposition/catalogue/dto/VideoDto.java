package fr.epsiflix.exposition.catalogue.dto;

// Nous pouvons ajouter des annotations Jakarta Bean Validation pour valider les champs de notre DTO

import jakarta.validation.constraints.NotNull;

public class VideoDto {

    @NotNull
    private String id;
    private String titre;
    private String description;
    private String url;
    private String categorie;

}