package java.fr.epsiflix.domain.catalogue.model.entities;

import java.fr.epsiflix.domain.catalogue.model.Categorie;
import java.fr.epsiflix.domain.catalogue.model.vo.BandeAnnonce;
import java.fr.epsiflix.domain.catalogue.model.vo.Episode;
import java.fr.epsiflix.domain.catalogue.model.vo.Serie;
import java.fr.epsiflix.domain.shared.UniqueId;
import java.util.Date;
import java.util.List;

public class Contenu extends BaseAggregatRoot<UniqueId, Contenu> {
    private final Categorie categorie;
    private final String titre;
    private final String description;
    private final Date dateAjout;
    private final String duree;
    private final String lien;
    private final List<Episode> episodes;
    private final List<BandeAnnonce> bandesAnnonces;
    private final Serie serie;

    // Constructor privé pour forcer l'utilisation du Builder
    private Contenu(Builder builder) {
        this.categorie = builder.categorie;
        this.titre = builder.titre;
        this.description = builder.description;
        this.dateAjout = builder.dateAjout;
        this.duree = builder.duree;
        this.lien = builder.lien;
        this.episodes = builder.episodes;
        this.bandesAnnonces = builder.bandesAnnonces;
        this.serie = builder.serie;
    }

    public static class Builder {
        private Categorie categorie;
        private String titre;
        private String description;
        private Date dateAjout;
        private String duree;
        private String lien;
        private List<Episode> episodes;
        private List<BandeAnnonce> bandesAnnonces;
        private Serie serie;

        public Builder setCategorie(Categorie categorie) {
            this.categorie = categorie;
            return this;
        }

        public Builder setTitre(String titre) {
            if (titre == null || titre.isBlank()) {
                throw new IllegalArgumentException("Le titre ne peut pas être vide ou null");
            }
            this.titre = titre;
            return this;
        }

        public Builder setDescription(String description) {
            if (description == null || description.isBlank()) {
                throw new IllegalArgumentException("La description ne peut pas être vide ou null");
            }
            this.description = description;
            return this;
        }

        public Builder setDateAjout(Date dateAjout) {
            this.dateAjout = dateAjout;
            return this;
        }

        public Builder setDuree(String duree) {
            this.duree = duree;
            return this;
        }

        public Builder setLien(String lien) {
            if (lien == null || lien.isBlank()) {
                throw new IllegalArgumentException("L'URL ne peut pas être vide ou null");
            }
            this.lien = lien;
            return this;
        }

        public Builder setEpisodes(List<Episode> episodes) {
            this.episodes = episodes;
            return this;
        }

        public Builder setBandesAnnonces(List<BandeAnnonce> bandesAnnonces) {
            this.bandesAnnonces = bandesAnnonces;
            return this;
        }

        public Builder setSerie(Serie serie) {
            this.serie = serie;
            return this;
        }

        public Contenu build() {
            return new Contenu(this);
        }
    }

    public void visionner() {
        // Implémentation de la fonctionnalité de visionnage
    }

    public void ajouterCoupDeCoeur() {
        // Implémentation de la fonctionnalité coup de coeur
    }
}
