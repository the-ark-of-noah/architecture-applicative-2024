import java.util.Date;
import java.util.UUID;

import src.main.java.fr.epsiflix.TypeAbonnement;

public class ClientAvecAbonnement extends Utilisateur {
    private Date dateDebut;
    private Date dateFin;
    private TypeAbonnement typeAbonnement;

    public void consulterHistorique() {}
    public void consulterRecommandations() {}
    public void consulterCoupDeCoeur() {}
    public void visionnerContenuEnIllimite() {}
    public void posterCommentaire(String contenu) {}
    public void accederForum() {}
    public void participerLive(String theme) {}
}