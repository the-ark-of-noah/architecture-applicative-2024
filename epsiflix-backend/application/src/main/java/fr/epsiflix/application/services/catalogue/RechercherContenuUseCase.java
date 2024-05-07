package fr.epsiflix.application.services.catalogue;

public interface RechercherContenuUseCase {
    List<Contenu> rechercherContenu(String titre);
    // Ou par critères...
}