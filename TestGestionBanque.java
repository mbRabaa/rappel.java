public class TestGestionBanque {
    public static void main(String[] args) {
        banque maBanque = new banque("MaBanque");

        Compte compte1 = new Compte("ahmed", 1000.0);
        CompteEpargne compte2 = new CompteEpargne("youssef");
        Compte compte3 = new Compte("joulia", 500.0);

        maBanque.ajoutCompte(compte1);
        maBanque.ajoutCompte(compte2);
        maBanque.ajoutCompte(compte3);

        System.out.println("Comptes de la banque " + maBanque.getNom() + ":");
        for (Compte compte : maBanque.getListCompte()) {
            System.out.println(compte);
        }

        try {
            compte1.debiter(1200.0);
            System.out.println("Le retrait a été effectué avec succès pour le compte1.");
        } catch (SoldeInsuffisantExeption e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        compte2.crediter(300.0);
        System.out.println("Nouveau solde du compte2 après le crédit : " + compte2.getSolde());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
