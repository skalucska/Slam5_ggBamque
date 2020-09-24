package fr.pgah.slam5;

public abstract class Compte {
    protected int numero;
    protected int solde;
    protected boolean estEtranger;

    public Compte(int numero, boolean estEtranger) {
        this.numero = numero;
        this.estEtranger = estEtranger;
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

    public void crediter(int montant) {
        solde += montant;
    }

    public abstract void appliquerInterets();

    public String toString() {
        return "";
    }

    public abstract boolean offreGarantieSuffisantePour(int montant);

}
