Feature: Ajouter une vidéo au catalogue
  En tant qu'administrateur, je veux pouvoir ajouter une vidéo au catalogue pour que les autres visiteurs puissent la voir.

    Scénario: Ajouter une vidéo au catalogue
        Etant donné que je suis connecté en tant qu'administrateur
        Quand je vais sur la page d'ajout de vidéo
        Et que je remplis le formulaire avec les informations de la vidéo
        Et que je clique sur le bouton "Ajouter"
        Alors je suis redirigé vers la page de la vidéo
        Et la vidéo est ajoutée au catalogue
        Et les autres visiteurs peuvent voir la vidéo