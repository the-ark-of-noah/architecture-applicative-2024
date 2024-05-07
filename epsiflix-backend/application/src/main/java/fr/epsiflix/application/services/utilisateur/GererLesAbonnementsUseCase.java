package fr.epsiflix.application.services.utilisateur;

public interface GererLesAbonnementsUseCase {
    void gererLesAbonnements(Long userId, List<Abonnement> abonnements);
}