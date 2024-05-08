package java.fr.epsiflix.domain.catalogue.model.vo;

import java.util.Objects;

public record BandeAnnonce(String title, String url) {

    // Plus spécifique que IllegalArgumentException pour les tests car plus spécifique
    public BandeAnnonce {
        if (title == null || title.isBlank()) {
            Objects.requireNonNull(title, "Le titre ne peux pas être vide ou null");
        }
        if (url == null || url.isBlank()) {
            Objects.requireNonNull(url, "L'URL ne peux pas être vide ou null");
        }
    }
}