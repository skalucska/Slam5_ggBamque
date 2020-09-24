package fr.pgah.slam5;

public class CompteCourant extends Compte {

    public CompteCourant(int num, boolean estEtranger) {
        super(num, estEtranger);
    }

    public void appliquerInterets() {
    }

    @Override
    public String toString() {
        String provenance;
        if (estEtranger) {
            provenance = "étranger";
        } else {
            provenance = "non-étranger";
        }

        return "\n\tCompte Courant" + numero + ": solde = " + solde + "(" + provenance + ")";

    }

    @Override
    public boolean offreGarantieSuffisantePour(int montant) {
        return solde >= 2 * montant / 3;
    }

}
