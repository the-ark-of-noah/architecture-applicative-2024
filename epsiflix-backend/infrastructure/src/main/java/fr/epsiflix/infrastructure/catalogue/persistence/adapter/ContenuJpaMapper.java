package fr.espiflix.infrastructure.mapper;

// Here is the perfect place to implement the mapping between the JPA entity and the domain entity.

public interface ContenuJpaMapper {

    ContenuEntity mapToEntity(Contenu contenu);

    Contenu mapToDomain(ContenuEntity contenuEntity);

}