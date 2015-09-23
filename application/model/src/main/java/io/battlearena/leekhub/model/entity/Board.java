package io.battlearena.leekhub.model.entity;

public class Board {
	Player player1;
	Player player2;
	Player player3;
	Player player4;
	int longueur;
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
	public final Player getPlayer3() {
		return player3;
	}
	public final void setPlayer3(Player player3) {
		this.player3 = player3;
	}
	public final Player getPlayer4() {
		return player4;
	}
	public final void setPlayer4(Player player4) {
		this.player4 = player4;
	}
	public final int getLongueur() {
		return longueur;
	}
	public final void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	public final int getLargeur() {
		return largeur;
	}
	public final void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Board [player1=" + player1.toString() + ", player2=" + player2.toString() + ", player3=" + player3.toString() + ", player4=" + player4.toString()
				+ ", longueur=" + longueur + ", largeur=" + largeur + "]";
	}
	
	

}
