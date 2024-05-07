package fr.epsiflix.infrastructure.catalogue.event.adapter;

@Mapper(ComponentModel = "spring", imports = UUID.class, uses = {EntityMapperUtils.class})
public interface ContenuAvroMapper {

    Contenu avroToDomain(ContenuAvro contenuAvro);
}