public class CompteEpargne extends Compte {
    private double benefice;

    public CompteEpargne(String titulaire) {
        super(titulaire);
        this.benefice = 0.0;
    }

    public double getBenefice() {
        return benefice;
    }

    public void setBenefice(double benefice) {
        this.benefice = benefice;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "titulaire='" + getTitulaire() + '\'' +
                ", solde=" + getSolde() +
                ", benefice=" + benefice +
                '}';
    }
}
