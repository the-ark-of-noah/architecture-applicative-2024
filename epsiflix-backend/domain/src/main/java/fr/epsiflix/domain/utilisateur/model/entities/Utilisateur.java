import java.util.Date;
import java.util.UUID;

@DDD.DomainEntity
public class Utilisateur extends BaseEntity<Category, UniqueId>{
    private UUID identifiant;
    private String motDePasse;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;

    public void seConnecter() {}
    public void seDeconnecter() {}
    public void modifierMotDePasse(String AncienMotDePasse, String NouveauMotDePasse) {}
    public void modifierProfil() {}
    public void consulterProfil() {}
    public void consulterHistorique() {}
    public void consulterRecommandations() {}
    public void consulterCoupDeCoeur() {}
    public void consulterContenus() {}
}
