package fr.epsiflix.application.services.catalogue;

public interface OrganiserUneSessionEnDirectUseCase {
    void organiserUneSessionEnDirect(ProfileUtilisateur profileUtilisateurId, String date, String heure);
}