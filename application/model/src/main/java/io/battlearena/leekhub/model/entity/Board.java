package io.battlearena.leekhub.model.entity;

public class Board {
	Player player1;
	Player player2;
	int nbrActionLeft;
	int largeur;
	
	public Board() {
		super();
	}
	
	public final Player getPlayer1() {
		return player1;
	}
	public final void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	public final Player getPlayer2() {
		return player2;
	}
	public final void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public final int getNbrActionLeft() {
		return nbrActionLeft;
	}

	public final void setNbrActionLeft(int nbrActionLeft) {
		this.nbrActionLeft = nbrActionLeft;
	}

	public final int getLargeur() {
		return largeur;
	}

	public final void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Board [player1=" + player1 + ", player2=" + player2 + ", nbrActionLeft=" + nbrActionLeft + ", largeur="
				+ largeur + "]";
	}

}
