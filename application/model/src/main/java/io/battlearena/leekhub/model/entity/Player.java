package io.battlearena.leekhub.model.entity;

public class Player {
	String nom;
	int nbrDePieces;
	String dernierMouvement;
	
	public Player() {
		super();
	}
	
	public final String getNom() {
		return nom;
	}
	public final void setNom(String nom) {
		this.nom = nom;
	}
	public final int getNbrDePieces() {
		return nbrDePieces;
	}
	public final void setNbrDePieces(int nbrDePieces) {
		this.nbrDePieces = nbrDePieces;
	}
	public final String getDernierMouvement() {
		return dernierMouvement;
	}
	public final void setDernierMouvement(String dernierMouvement) {
		this.dernierMouvement = dernierMouvement;
	}

	@Override
	public String toString() {
		return "Player [nom=" + nom + ", nbrDePieces=" + nbrDePieces + ", dernierMouvement=" + dernierMouvement + "]";
	}
	
	
}
