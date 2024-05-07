package fr.epsiflix.exposition.catalogue.api.rest;

import fr.epsiflix.application.catalogue.usecases.ListerVideosParCategoriesUseCase;

import fr.epsiflix.domaine.catalogue.Video;

public class CatalogueController {
    private final ListerVideosParCategoriesUseCase listerVideosParCategoriesService;
    private final CatalogueExpositionMapper mapper;

    public CatalogueController(
            ListerVideosParCategoriesUseCase listerVideosParCategoriesService,
            CatalogueExpositionMapper mapper
    ) {
        this.listerVideosParCategoriesService = listerVideosParCategoriesService;
        this.mapper = mapper;
    }

    @GetMapping("/categories/{categorie}")
    public List<VideoDto> listerVideosParCategories(@PathVariable String categorie) {
        return listerVideosParCategoriesService.listerVideosParCategories(categorie).stream()
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
    }
}