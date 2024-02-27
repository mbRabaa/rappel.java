import java.util.ArrayList;
import java.util.List;

public class banque {
    private String nom;
    private List<Compte> listCompte;

    public banque() {
        this.nom = "";
        this.listCompte = new ArrayList<>();
    }

    public banque(String nom) {
        this.nom = nom;
        this.listCompte = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void ajoutCompte(Compte compte) {
        listCompte.add(compte);
    }

    public List<Compte> getListCompte() {
        return listCompte;
    }
}
