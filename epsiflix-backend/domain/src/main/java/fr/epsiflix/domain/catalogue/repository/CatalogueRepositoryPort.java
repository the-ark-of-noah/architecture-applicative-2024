package fr.epsiflix.domain.catalogue.repository;

import fr.epsiflix.domain.catalogue.model.Product;
import fr.epsiflix.domain.shared.UniqueId;

public interface CatalogueRepository {
    void ajouterVideo(Video video);
    void supprimerVideo(UniqueId id);
    void modifierVideo(UniqueId id, Video video);
    List<Video> listerVideos();
    List<Video> listerVideosParCategories(String categorie);
}