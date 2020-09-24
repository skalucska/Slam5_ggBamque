package fr.pgah.slam5;

public class Compte {
    private int numero;
    private int solde;
    private boolean estEtranger;
    private double taux = 0.01;
    private int type;

    public Compte(int numero, boolean estEtranger, int type) {
        this.numero = numero;
        this.estEtranger = estEtranger;
        this.type = type;

    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int montant) {
        solde = montant;
    }

    public boolean getEstEtranger() {
        return estEtranger;
    }

    public void appliquerInterets() {
        if (type == 1) {
            solde = (int) (solde * (1 + taux));
        }
    }

    public void crediter(int montant) {
        solde += montant;
    }

    public String toString() {
        String provenance;
        String typeCompte;
        if (estEtranger) {
            provenance = "étranger";
        } else {
            provenance = "non-étranger";
        }
        if (type == 1) {
            typeCompte = "Epargne";
        } else {
            typeCompte = "Courant";
        }

        return "\n\tCompte " + typeCompte + " - " + numero + ": solde = " + solde + "(" + provenance + ")";

    }

    public boolean offreGarantieSuffisantePour(int montant) {
        if (type == 1) {
            return solde >= montant / 2;
        } else {
            return solde >= 2 * montant / 3;
        }

    }

}
