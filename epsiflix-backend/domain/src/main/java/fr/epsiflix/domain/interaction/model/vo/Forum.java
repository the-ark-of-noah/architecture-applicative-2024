package java.fr.epsiflix.domain.interaction.model.vo;

import java.util.Objects;

record Forum(String title, String description, String url) {

    Forum {
        if (title == null || title.isBlank()) {
            Objects.requireNonNull(title, "Le titre ne peux pas être vide ou null");
        }
        if (description == null || description.isBlank()) {
            Objects.requireNonNull(description, "La description ne peux pas être vide ou null");
        }
        if (url == null || url.isBlank()) {
            Objects.requireNonNull(url, "L'URL ne peux pas être vide ou null");
        }
    }
}