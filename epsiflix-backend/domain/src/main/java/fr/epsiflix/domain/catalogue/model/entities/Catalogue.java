package fr.epsiflix.catalogue;

import java.fr.epsiflix.domain.shared.UniqueId;

public class Catalogue extends BaseEntity<UniqueId, Catalogue> {
    private Contenu[] contenus;
    public Catalogue() {}

    public void rechercherContenu() {}
    public void filtrerContenu() {}
    public void trierContenu() {}
    public void consulterCatalogue() {}
}