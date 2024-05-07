package fr.epsiflix.infrastructure.common.adapter;

@Mapper(ComponentModel = "spring")
public interface EntityMapperUtils {

    default UUID mapToUUID(String uuid) {
        return UUID.fromString(uuid);
    }

//    ... Autres méthodes de mapping utilisées dans sur la couche Infrastructure

}