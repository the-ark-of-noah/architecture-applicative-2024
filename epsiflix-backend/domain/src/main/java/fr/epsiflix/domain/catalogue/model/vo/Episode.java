package java.fr.epsiflix.domain.catalogue.model.vo;

public record Episode(String title, String description, int duration, int season, int episodeNumber) {

    Episode {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Le titre ne peux pas être vide ou null");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("La description ne peux pas être vide ou null");
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("La durée doit être supérieure à 0");
        }
        if (season <= 0) {
            throw new IllegalArgumentException("La saison doit être supérieure à 0");
        }
        if (episodeNumber <= 0) {
            throw new IllegalArgumentException("Le numéro d'épisode doit être supérieur à 0");
        }
    }
}
