package java.fr.epsiflix.domain.model;

import java.fr.epsiflix.domain.catalogue.model.entities.Contenu;
import java.fr.epsiflix.domain.catalogue.model.vo.BandeAnnonce;
import java.fr.epsiflix.domain.catalogue.model.vo.Episode;
import java.util.List;

public class ContenuFactoryTest {

    // L'objectif de ce test est de tester la création d'un agrégat racine pour vérifier que les règles métiers sont bien respectées,
    // et que notre domaine n'est pas corrompu. Celle-ci doit s'exécuter à chaque déploiement pour vérifier que le code est toujours valide.

    public void sould_create_contenu_aggregat_root() {
        // Given
        List<Episode> episodes = mock(List.class);
        List<BandeAnnonce> bandesAnnonces = mock(List.class);

        Contenu contenu = new Contenu.Builder().
                setCategorie(null).
                setTitre("Titre").
                setDescription("Description").
                setDateAjout(null).
                setDuree("Duree").
                setLien("Lien").
                setEpisodes(episodes).
                setBandesAnnonces(bandesAnnonces).
                setSerie(null)
                .build();

        // When
        contenu.assertEntityIsValid();
    }
}
