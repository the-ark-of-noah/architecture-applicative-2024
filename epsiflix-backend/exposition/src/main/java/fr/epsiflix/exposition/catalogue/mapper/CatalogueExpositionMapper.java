package fr.epsiflix.exposition.catalogue.mapper;

import fr.epsiflix.domaine.catalogue.Video;
import fr.epsiflix.exposition.catalogue.dto.VideoDto;

public class CatalogueExpositionMapper {

    // vide pour éviter l'instanciation directe
    // Nous pouvons aussi utiliser MapStruct pour mapper les objets, chose conseillé
    public CatalogueExpositionMapper() {
    }

    public VideoDto mapToDto(Video video) {
        VideoDto videoDto = new VideoDto();
        videoDto.setId(video.getId());
        videoDto.setTitre(video.getTitre());
        videoDto.setDescription(video.getDescription());
        videoDto.setUrl(video.getUrl());
        videoDto.setCategorie(video.getCategorie());
        return videoDto;
    }

    public Video mapToDomain(VideoDto videoDto) {
        Video video = new Video();
        video.setId(videoDto.getId());
        video.setTitre(videoDto.getTitre());
        video.setDescription(videoDto.getDescription());
        video.setUrl(videoDto.getUrl());
        video.setCategorie(videoDto.getCategorie());
        return video;
    }
}