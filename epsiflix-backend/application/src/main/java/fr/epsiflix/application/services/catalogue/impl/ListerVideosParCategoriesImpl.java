package fr.epsiflix.application.services.catalogue.impl;

@Service
@Transactional
public class ListerVideosParCategoriesImpl implements ListerVideosParCategoriesUseCase {

    private CatalogueRepositoryPort catalogueRepository;

    public ListerVideosParCategoriesImpl(CatalogueRepositoryPort catalogueRepository) {
        this.catalogueRepository = catalogueRepository;
    }

    // Vérifie que l'utilisateur a les privilèges de gestion
    // avant de lister les vidéos par catégories

    @Override
    @PreAuthorize("@authorities.hasManagePrivileges(authentication)")
    public List<Video> listerVideosParCategories(String categorie) {
        List<Video> videos = new ArrayList<>();
        List<Product> products = catalogueRepository.listerVideos();
        for (Product product : products) {
            if (product.getCategorie().equals(categorie)) {
                videos.add(product);
            }
        }
        return videos;
    }
}