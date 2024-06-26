package java.fr.epsiflix.domain.catalogue.model.vo;

import java.util.Objects;

public record Serie(
        String title,
        String description,
        String url
) {
    public Serie {
        if (title == null || title.isBlank()) {
            Objects.requireNonNull(title, "Le titre ne peux pas être vide ou null");
        }
        if (description == null || description.isBlank()) {
            Objects.requireNonNull(description, "La description ne peux pas être vide ou null");
        }
    }
}